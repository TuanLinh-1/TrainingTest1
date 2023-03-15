package edu.poly.trainingtest.Controller;

import edu.poly.trainingtest.DTO.BrandDTO;
import edu.poly.trainingtest.Entity.Brand;
import edu.poly.trainingtest.Entity.Category;
import edu.poly.trainingtest.Service.BrandService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("apiBrand")
public class BrandRestController {
    @Autowired
    private BrandService brandservice;
    @GetMapping()
    public List<BrandDTO> findAll(){
        List<BrandDTO> brandDTOList = new ArrayList<>();
        List<Brand> brandList = brandservice.findAll();
        for (Brand item : brandList ) {
            BrandDTO brandDTO = new BrandDTO();
            BeanUtils.copyProperties(item,brandDTO);
            brandDTOList.add(brandDTO);
        }
        return brandDTOList;
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Brand createBrand( BrandDTO brandDTO){
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDTO,brand);
        brandservice.save(brand);
        return brand;
    }

//    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    public @RequestBody Brand createBrand( BrandDTO brandDTO){
//        Brand brand = new Brand();
//        BeanUtils.copyProperties(brandDTO,brand);
//        brandservice.save(brand);
//        return brand;
//    }
}
