package lab.kevin.connection.provider;

import org.jooq.impl.DefaultConnectionProvider;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0ConnectionProvider extends DefaultConnectionProvider implements Provider<Connection> {
    private final DataSource dataSource;

    @Inject
    public C3P0ConnectionProvider(DataSource dataSource) throws SQLException {
        super(null);
        this.dataSource = dataSource;
        setConnection(dataSource.getConnection());
    }

    @Override
    public Connection get() {
        return acquire();
    }
}
