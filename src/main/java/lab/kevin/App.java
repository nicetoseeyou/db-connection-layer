package lab.kevin;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lab.kevin.connection.module.DataSourceModule;
import lab.kevin.connection.module.ServiceInitModule;
import lab.kevin.connection.provider.C3P0ConnectionProvider;
import lab.kevin.connection.provider.DSLContextProvider;
import lab.kevin.connection.provider.DataSourceProvider;
import lab.kevin.connection.servrice.BookServiceImpl;
import lab.kevin.connection.servrice.DSLService;
import lab.kevin.dto.BookDTO;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

import static lab.kevin.db.Tables.AUTHOR;
import static lab.kevin.db.Tables.BOOK;

public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World");
        Injector init = Guice.createInjector(new DataSourceModule()
                , new ServiceInitModule());
        //DataSource dataSource = init.getInstance(DataSourceProvider.class).get();
        //Connection connection = init.getInstance(C3P0ConnectionProvider.class).get();
        DSLContext dslContext = init.getInstance(DSLContextProvider.class).get();
        Result result = dslContext.dsl().select().from(BOOK).fetch();
        System.out.println(result);
        DSLService bookService = init.getInstance(BookServiceImpl.class);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(30);
        IntStream.range(1, 1000).forEach(
                i -> {
                    executor.execute(() -> {
                        IntStream.range(1,5).forEach(
                                j -> {
                                    System.out.println(String.format("---- Task %d  \t %s \t %s", i, Thread.currentThread().getName(), bookService.query(new BookDTO(j))));
                                }
                        );
                    });

                }
        );

        executor.shutdown();
    }
}
