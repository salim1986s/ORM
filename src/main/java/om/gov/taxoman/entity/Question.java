package om.gov.taxoman.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data




public class Question {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;

    @Column(name="QUESTION")
    private String question;

    @Column(name="ANSWER")
    private String answer;
}
