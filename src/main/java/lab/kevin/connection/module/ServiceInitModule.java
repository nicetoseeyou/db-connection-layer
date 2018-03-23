package lab.kevin.connection.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import lab.kevin.connection.servrice.AuthorServiceImpl;
import lab.kevin.connection.servrice.BookServiceImpl;
import lab.kevin.connection.servrice.DSLService;

public class ServiceInitModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DSLService.class).annotatedWith(Names.named("AuthorService")).to(AuthorServiceImpl.class);
        bind(DSLService.class).annotatedWith(Names.named("BookService")).to(BookServiceImpl.class);
    }
}
