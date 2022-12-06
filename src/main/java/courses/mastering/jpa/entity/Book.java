package courses.mastering.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private long author;
    private String isbn;
    private int publicationYear;
}
