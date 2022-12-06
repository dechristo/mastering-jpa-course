package courses.mastering.jpa.service;

import courses.mastering.jpa.entity.Book;
import courses.mastering.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void add(Book book) {
        /*
         *  TODO: Distinguish by create and update in order
         *        to return proper http code on the controller.
         */
        bookRepository.save(book);
    }

    public void deleteById(long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public List<Book> getByAuthor(Long authorId) {
        return bookRepository.getByAuthor(authorId);
    }
}