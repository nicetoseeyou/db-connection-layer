/*
 * This file is generated by jOOQ.
*/
package lab.kevin.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import lab.kevin.db.Indexes;
import lab.kevin.db.Keys;
import lab.kevin.db.Public;
import lab.kevin.db.tables.records.BookToBookStoreRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStore extends TableImpl<BookToBookStoreRecord> {

    private static final long serialVersionUID = -167567437;

    /**
     * The reference instance of <code>PUBLIC.BOOK_TO_BOOK_STORE</code>
     */
    public static final BookToBookStore BOOK_TO_BOOK_STORE = new BookToBookStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookToBookStoreRecord> getRecordType() {
        return BookToBookStoreRecord.class;
    }

    /**
     * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.NAME</code>.
     */
    public final TableField<BookToBookStoreRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
     */
    public final TableField<BookToBookStoreRecord, Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.STOCK</code>.
     */
    public final TableField<BookToBookStoreRecord, Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
     */
    public BookToBookStore() {
        this(DSL.name("BOOK_TO_BOOK_STORE"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
     */
    public BookToBookStore(String alias) {
        this(DSL.name(alias), BOOK_TO_BOOK_STORE);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
     */
    public BookToBookStore(Name alias) {
        this(alias, BOOK_TO_BOOK_STORE);
    }

    private BookToBookStore(Name alias, Table<BookToBookStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookToBookStore(Name alias, Table<BookToBookStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_IDX_FK_B2BS_BOOK_10136, Indexes.SYS_IDX_FK_B2BS_BOOK_STORE_10134, Indexes.SYS_IDX_SYS_PK_10130_10131);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookToBookStoreRecord> getPrimaryKey() {
        return Keys.SYS_PK_10130;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookToBookStoreRecord>> getKeys() {
        return Arrays.<UniqueKey<BookToBookStoreRecord>>asList(Keys.SYS_PK_10130);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BookToBookStoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookToBookStoreRecord, ?>>asList(Keys.FK_B2BS_BOOK_STORE, Keys.FK_B2BS_BOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStore as(String alias) {
        return new BookToBookStore(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStore as(Name alias) {
        return new BookToBookStore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookToBookStore rename(String name) {
        return new BookToBookStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookToBookStore rename(Name name) {
        return new BookToBookStore(name, null);
    }
}
