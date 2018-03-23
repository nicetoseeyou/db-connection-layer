package lab.kevin.connection.servrice;

import org.jooq.DSLContext;

public interface DSLService<T, R> {
    void setDSLContext(DSLContext dslContext);
    R query(T t);
}
