package edu.poly.trainingtest.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String cate_code;
    @Column
    private String cate_name;
    @OneToMany(mappedBy = "category")
    List<Sub_category>subCategoryList;

}
