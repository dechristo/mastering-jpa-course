package courses.mastering.jpa.repository;

import courses.mastering.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    public Book getById(Long id);

    public List<Book> getByAuthor(Long authorId);
}
