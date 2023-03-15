package edu.poly.trainingtest.DTO;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private long id;
    private long subcate_id;
    private String subcate_name;
    private String produce_name;
    private  String color;
    private long quantity;
    private double sell_price;
    private double origin_price;
    private String description;
    private  long status_id;
    private  String status_name;
    private  long brand_id;
    private  String brand_name;
}
