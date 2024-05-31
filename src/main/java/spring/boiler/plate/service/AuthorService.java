package spring.boiler.plate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boiler.plate.repository.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public String createAuthor(final spring.boiler.plate.model.Author author) {
        authorRepository.createAuthor(author);
        return "Waah";
    }
}
