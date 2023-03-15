package edu.poly.trainingtest.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
//    @Column
//    private long subcate_id;
    @ManyToOne @JoinColumn(name = "subcate_id")
    Sub_category subCategory;
    @Column
    private String produce_name;
    @Column
    private String color;
    @Column
    private long quantity;
    @Column
    private double sell_price;
    @Column
    private double origin_price;
    @Column
    private String description;

//    @Column
//    private long status_id;
    @ManyToOne @JoinColumn(name = "status_id")
    Status status;
//    @Column
//    private long brand_id;
    @ManyToOne @JoinColumn(name="brand_id")
    Brand brand;
}
