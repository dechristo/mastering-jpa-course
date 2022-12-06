package courses.mastering.jpa.service;

import courses.mastering.jpa.entity.Author;
import courses.mastering.jpa.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public void save(Author author) {
        authorRepository.save(author);
    }

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author getByFirstNameAndLastName(String firstName, String lastName) {
        return authorRepository.getByFirstNameAndLastName(firstName, lastName);
    }
}
