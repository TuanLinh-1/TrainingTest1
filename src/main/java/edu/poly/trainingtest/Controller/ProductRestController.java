package edu.poly.trainingtest.Controller;

import edu.poly.trainingtest.DTO.BrandDTO;
import edu.poly.trainingtest.DTO.ProductDTO;
import edu.poly.trainingtest.Entity.Brand;
import edu.poly.trainingtest.Entity.Product;
import edu.poly.trainingtest.Entity.Status;
import edu.poly.trainingtest.Entity.Sub_category;
import edu.poly.trainingtest.Service.BrandService;
import edu.poly.trainingtest.Service.ProductService;
import edu.poly.trainingtest.Service.StatusService;
import edu.poly.trainingtest.Service.SubCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apiProduct")
public class ProductRestController {
    @Autowired
    private  ProductService productservice;

    @Autowired
    private BrandService brandservice;

    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private StatusService statusService;

    @GetMapping()
    public List<ProductDTO> findAll() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        List<Product> productList = productservice.findAll();
        for (Product item : productList) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(item, productDTO);

            productDTO.setSubcate_id(item.getSubCategory().getId());
            productDTO.setSubcate_name(item.getSubCategory().getSub_cate_name());

            productDTO.setStatus_id(item.getStatus().getId());
            productDTO.setStatus_name(item.getStatus().getStatus_name());

            productDTO.setBrand_id(item.getBrand().getId());
            productDTO.setBrand_name(item.getBrand().getBrand_name());

            productDTOList.add(productDTO);
        }
        return productDTOList;
    }
     @GetMapping("/{id}")
    public ProductDTO findbyid(@PathVariable("id") Long id){
        Optional<Product> otp = productservice.findById(id);
         ProductDTO productDTO = new ProductDTO();
        if(otp.isPresent()){
            BeanUtils.copyProperties(otp.get(),productDTO);

            productDTO.setSubcate_id(otp.get().getSubCategory().getId());
            productDTO.setSubcate_name(otp.get().getSubCategory().getSub_cate_name());

            productDTO.setStatus_id(otp.get().getStatus().getId());
            productDTO.setStatus_name(otp.get().getStatus().getStatus_name());

            productDTO.setBrand_id(otp.get().getBrand().getId());
            productDTO.setBrand_name(otp.get().getBrand().getBrand_name());
            return  productDTO;
        }
        return null;
     }
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createProduct(ProductDTO productDTO){
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);

        Optional<Brand> brandOptional = brandservice.findById(productDTO.getBrand_id());
        if(brandOptional.isPresent()){
            product.setBrand(brandOptional.get());
        }

        Optional<Sub_category> subCategoryOptional =subCategoryService.findById(productDTO.getSubcate_id());
        if(subCategoryOptional.isPresent()){
            product.setSubCategory(subCategoryOptional.get());
        }

        Optional<Status> statusOptional = statusService.findById(productDTO.getStatus_id());
        if(statusOptional.isPresent()){
            product.setStatus(statusOptional.get());
        }

        productservice.save(product);
        return "success";
    }
    @PutMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String updateProduct(ProductDTO productDTO){
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);

        Optional<Brand> brandOptional = brandservice.findById(productDTO.getBrand_id());
        if(brandOptional.isPresent()){
            product.setBrand(brandOptional.get());
        }

        Optional<Sub_category> subCategoryOptional =subCategoryService.findById(productDTO.getSubcate_id());
        if(subCategoryOptional.isPresent()){
            product.setSubCategory(subCategoryOptional.get());
        }

        Optional<Status> statusOptional = statusService.findById(productDTO.getStatus_id());
        if(statusOptional.isPresent()){
            product.setStatus(statusOptional.get());
        }

        productservice.save(product);
        return"Succes";
    }
//        @GetMapping("post")
//    public Product findByID(){
//        Optional<Product> opt = productservice.findById(Long.parseLong("1"));
//        if(opt.isPresent()){
//            return opt.get();
//        }
//        return null;
//    }
}
