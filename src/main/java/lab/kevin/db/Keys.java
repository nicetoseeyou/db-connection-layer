/*
 * This file is generated by jOOQ.
*/
package lab.kevin.db;


import javax.annotation.Generated;

import lab.kevin.db.tables.Author;
import lab.kevin.db.tables.Book;
import lab.kevin.db.tables.BookStore;
import lab.kevin.db.tables.BookToBookStore;
import lab.kevin.db.tables.Language;
import lab.kevin.db.tables.records.AuthorRecord;
import lab.kevin.db.tables.records.BookRecord;
import lab.kevin.db.tables.records.BookStoreRecord;
import lab.kevin.db.tables.records.BookToBookStoreRecord;
import lab.kevin.db.tables.records.LanguageRecord;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> SYS_PK_10102 = UniqueKeys0.SYS_PK_10102;
    public static final UniqueKey<BookRecord> SYS_PK_10108 = UniqueKeys0.SYS_PK_10108;
    public static final UniqueKey<BookStoreRecord> SYS_CT_10124 = UniqueKeys0.SYS_CT_10124;
    public static final UniqueKey<BookToBookStoreRecord> SYS_PK_10130 = UniqueKeys0.SYS_PK_10130;
    public static final UniqueKey<LanguageRecord> SYS_PK_10096 = UniqueKeys0.SYS_PK_10096;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR = ForeignKeys0.FK_BOOK_AUTHOR;
    public static final ForeignKey<BookRecord, LanguageRecord> FK_BOOK_LANGUAGE = ForeignKeys0.FK_BOOK_LANGUAGE;
    public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BOOK_STORE = ForeignKeys0.FK_B2BS_BOOK_STORE;
    public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_BOOK = ForeignKeys0.FK_B2BS_BOOK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> SYS_PK_10102 = Internal.createUniqueKey(Author.AUTHOR, "SYS_PK_10102", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> SYS_PK_10108 = Internal.createUniqueKey(Book.BOOK, "SYS_PK_10108", Book.BOOK.ID);
        public static final UniqueKey<BookStoreRecord> SYS_CT_10124 = Internal.createUniqueKey(BookStore.BOOK_STORE, "SYS_CT_10124", BookStore.BOOK_STORE.NAME);
        public static final UniqueKey<BookToBookStoreRecord> SYS_PK_10130 = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "SYS_PK_10130", BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
        public static final UniqueKey<LanguageRecord> SYS_PK_10096 = Internal.createUniqueKey(Language.LANGUAGE, "SYS_PK_10096", Language.LANGUAGE.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR = Internal.createForeignKey(lab.kevin.db.Keys.SYS_PK_10102, Book.BOOK, "FK_BOOK_AUTHOR", Book.BOOK.AUTHOR_ID);
        public static final ForeignKey<BookRecord, LanguageRecord> FK_BOOK_LANGUAGE = Internal.createForeignKey(lab.kevin.db.Keys.SYS_PK_10096, Book.BOOK, "FK_BOOK_LANGUAGE", Book.BOOK.LANGUAGE_ID);
        public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BOOK_STORE = Internal.createForeignKey(lab.kevin.db.Keys.SYS_CT_10124, BookToBookStore.BOOK_TO_BOOK_STORE, "FK_B2BS_BOOK_STORE", BookToBookStore.BOOK_TO_BOOK_STORE.NAME);
        public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_BOOK = Internal.createForeignKey(lab.kevin.db.Keys.SYS_PK_10108, BookToBookStore.BOOK_TO_BOOK_STORE, "FK_B2BS_BOOK", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }
}
