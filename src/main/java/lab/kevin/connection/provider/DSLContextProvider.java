package lab.kevin.connection.provider;

import com.google.inject.name.Named;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.inject.Inject;
import javax.inject.Provider;
import java.sql.Connection;

public class DSLContextProvider implements Provider<DSLContext> {

    private final Connection connection;
    private final SQLDialect sqlDialect;

    @Inject
    public DSLContextProvider(Connection connection, SQLDialect sqlDialect) {
        this.connection = connection;
        this.sqlDialect = sqlDialect;
    }

    @Override
    public DSLContext get() {
        return DSL.using(connection, sqlDialect);
    }
}
