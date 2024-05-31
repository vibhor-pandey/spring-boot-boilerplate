package spring.boiler.plate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.boiler.plate.model.Author;
import spring.boiler.plate.service.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/author")
    public String createAuthor(@RequestBody final Author author) {
        return authorService.createAuthor(author);
    }
}
