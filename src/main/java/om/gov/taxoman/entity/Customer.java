package om.gov.taxoman.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMERS")

public class Customer {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="ADDRESS")
    private String Address;

    @Column(name="PHONE")
    private String PhoneNo;


}
