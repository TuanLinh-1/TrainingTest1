package edu.poly.trainingtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("View")
public class ViewController {
    @GetMapping("home")
    public String getHome(Model model){
        model.addAttribute("message","xin chao");
        return "index";
    }
}
