package om.gov.taxoman.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="ORDERS")
public class Order {

    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name="STATUS")
    private OrderStatues status;

    @ManyToMany
    private List<Product> products;
}
