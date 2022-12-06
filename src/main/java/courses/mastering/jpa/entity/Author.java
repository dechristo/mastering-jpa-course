package courses.mastering.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String country;
}
