package om.gov.taxoman.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    @Column(name="PRODUCT_ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="PRICE")
    private double price;

    //ElementCollection if we want to add more than pic for each product
    @ElementCollection
    private List<String> urls;

    @ManyToMany(mappedBy = "products")
    private List<Order> orders;







}
