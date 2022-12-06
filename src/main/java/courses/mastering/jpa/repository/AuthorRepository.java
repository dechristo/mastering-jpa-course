package courses.mastering.jpa.repository;

import courses.mastering.jpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    public Author getByFirstNameAndLastName(String firstName, String LastName);
}
