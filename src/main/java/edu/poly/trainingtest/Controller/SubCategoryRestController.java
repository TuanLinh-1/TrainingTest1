package edu.poly.trainingtest.Controller;

import edu.poly.trainingtest.DTO.SubCategoryDTO;
import edu.poly.trainingtest.Entity.Sub_category;
import edu.poly.trainingtest.Service.SubCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("SubCategoryAPI")
public class SubCategoryRestController {
        @Autowired
        SubCategoryService subcategoryservice;
        @GetMapping
        public List<SubCategoryDTO> findAll(){
                List<SubCategoryDTO> subCategoryDTOList = new ArrayList<>();
                List<Sub_category> sub_categoryList = subcategoryservice.findAll();
                for (Sub_category item: sub_categoryList) {
                        SubCategoryDTO subcategoryDTO = new SubCategoryDTO();
                        BeanUtils.copyProperties(item,subcategoryDTO);
                        subcategoryDTO.setCate_id(item.getCategory().getId());
                        subcategoryDTO.setCate_name(item.getCategory().getCate_name());
                        subCategoryDTOList.add(subcategoryDTO);
                }
                return subCategoryDTOList;
        }
}
