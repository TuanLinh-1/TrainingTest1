package edu.poly.trainingtest.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Sub_category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  long id;
    @Column
    private  String sub_cate_code;
    @Column
    private String sub_cate_name;
    //    @Column
//    private long cate_id;
    @ManyToOne @JoinColumn(name = "cate_id")
    Category category;
    @OneToMany(mappedBy = "subCategory")
    List<Product> productList;

}
