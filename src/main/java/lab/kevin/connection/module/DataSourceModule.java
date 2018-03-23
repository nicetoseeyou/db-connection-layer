package lab.kevin.connection.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import lab.kevin.connection.provider.C3P0ConnectionProvider;
import lab.kevin.connection.provider.DSLContextProvider;
import lab.kevin.connection.provider.DataSourceProvider;
import lab.kevin.utils.PropHandler;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;

import javax.sql.DataSource;
import java.sql.Connection;

public class DataSourceModule extends AbstractModule {
    @Override
    protected void configure() {
        Names.bindProperties(binder(), PropHandler.readResources("datasource.properties"));
        bind(DataSource.class).toProvider(DataSourceProvider.class).in(Scopes.SINGLETON);
        bind(Connection.class).toProvider(C3P0ConnectionProvider.class);
        bind(SQLDialect.class).toInstance(SQLDialect.HSQLDB);
        bind(DSLContext.class).toProvider(DSLContextProvider.class);
    }
}
