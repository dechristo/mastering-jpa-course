package courses.mastering.jpa.repository;

import courses.mastering.jpa.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book getById(Long id);

    List<Book> getByAuthor(Long authorId);

    Page<Book> findAll(Pageable pageable);
}
