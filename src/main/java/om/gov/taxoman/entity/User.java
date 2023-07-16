package om.gov.taxoman.entity;

import jakarta.persistence.*;

@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="EMAIL")
    private String emil;

    @Column(name="PASSWORD")
    private String password;
}
