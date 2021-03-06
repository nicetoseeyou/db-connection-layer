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
import lab.kevin.db.tables.records.LanguageRecord;

import org.jooq.Field;
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
public class Language extends TableImpl<LanguageRecord> {

    private static final long serialVersionUID = 2092950691;

    /**
     * The reference instance of <code>PUBLIC.LANGUAGE</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguageRecord> getRecordType() {
        return LanguageRecord.class;
    }

    /**
     * The column <code>PUBLIC.LANGUAGE.ID</code>.
     */
    public final TableField<LanguageRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LANGUAGE.CD</code>.
     */
    public final TableField<LanguageRecord, String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LANGUAGE.DESCRIPTION</code>.
     */
    public final TableField<LanguageRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language() {
        this(DSL.name("LANGUAGE"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language(String alias) {
        this(DSL.name(alias), LANGUAGE);
    }

    /**
     * Create an aliased <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language(Name alias) {
        this(alias, LANGUAGE);
    }

    private Language(Name alias, Table<LanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Language(Name alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SYS_IDX_SYS_PK_10096_10098);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LanguageRecord> getPrimaryKey() {
        return Keys.SYS_PK_10096;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LanguageRecord>> getKeys() {
        return Arrays.<UniqueKey<LanguageRecord>>asList(Keys.SYS_PK_10096);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language as(String alias) {
        return new Language(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language as(Name alias) {
        return new Language(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(String name) {
        return new Language(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Name name) {
        return new Language(name, null);
    }
}
