package edu.poly.trainingtest.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Brand {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private  long id;
    @Column
    private String brand_name;
//    @OneToMany(mappedBy = "brand")
//    List<Product> productList;
}
