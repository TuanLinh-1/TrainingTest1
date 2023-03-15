package edu.poly.trainingtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("Brand")
public class BrandController {
    @GetMapping
    public String getBrand(Model model){
        model.addAttribute("message","BrandViews");
        return "brandIndex" ;
    }
}
