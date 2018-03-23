package lab.kevin.connection.servrice;

import com.google.inject.Inject;
import lab.kevin.db.tables.records.BookRecord;
import lab.kevin.dto.BookDTO;
import org.jooq.DSLContext;
import static lab.kevin.db.Tables.BOOK;

public class BookServiceImpl implements DSLService<BookDTO, BookDTO> {
    private DSLContext dslContext;

    @Override
    @Inject
    public void setDSLContext(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public BookDTO query(BookDTO book) {
        return dslContext.dsl().select()
                .from(BOOK)
                .where(BOOK.ID.eq(book.getId()))
                .fetchOne()
                .map(record -> {
                    BookRecord b = (BookRecord) record;
                    return new BookDTO(b.getId(), b.getAuthorId(), b.getTitle(), b.getPublishedIn(), b.getLanguageId());
                });
    }
}
