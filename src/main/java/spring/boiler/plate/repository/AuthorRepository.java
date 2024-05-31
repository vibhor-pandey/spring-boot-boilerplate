package spring.boiler.plate.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.boiler.plate.model.Author;
import spring.boiler.plate.spring_boilerplate.jooq.tables.records.AuthorRecord;

import static spring.boiler.plate.spring_boilerplate.jooq.tables.Author.AUTHOR;

@Repository
public class AuthorRepository {

    @Autowired
    private DSLContext dslContext;

    public AuthorRecord createAuthor(final Author author) {
        return dslContext.insertInto(AUTHOR, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME, AUTHOR.BIRTHDAY, AUTHOR.COUNTRY, AUTHOR.WRITING_HRS_PER_DAY)
                .values(author.getFirstName(), author.getLastName(), author.getBirthday(), author.getCountry(), author.getWritingHoursPerDay())
                .returning(AUTHOR.ID).fetchOne();
    }
}
