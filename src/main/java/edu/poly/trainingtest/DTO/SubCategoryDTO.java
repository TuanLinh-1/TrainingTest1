package edu.poly.trainingtest.DTO;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryDTO {
    private  long id;
    private  String sub_cate_code;
    private  String sub_cate_name;
    private long cate_id;
    private String cate_name;
}
