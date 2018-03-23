package lab.kevin.connection.servrice;

import lab.kevin.db.tables.Author;
import lab.kevin.db.tables.Book;
import lab.kevin.db.tables.records.AuthorRecord;
import lab.kevin.dto.AuthorDTO;
import org.jooq.DSLContext;
import org.jooq.Result;

import javax.inject.Inject;

import static lab.kevin.db.Tables.AUTHOR;

public class AuthorServiceImpl implements DSLService<AuthorDTO, AuthorDTO> {
    private DSLContext dslContext;

    @Override
    @Inject
    public void setDSLContext(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public AuthorDTO query(AuthorDTO author) {
        return dslContext.dsl().select()
                .from(AUTHOR)
                .where(AUTHOR.ID.eq(author.getId()))
                .fetchOne()
                .map(record -> {
                    AuthorRecord a = (AuthorRecord) record;
                    return new AuthorDTO(a.getId(), a.getFirstName(), a.getLastName(), a.getDateOfBirth(), a.getYearOfBirth(), a.getDistinguished());
                });
    }
}
