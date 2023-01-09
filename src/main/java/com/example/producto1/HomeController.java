package com.example.producto1;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(@RequestParam(name = "nombre",required = true,defaultValue = "Pau")String nombre, Model model){
        model.addAttribute("nombre",nombre);
        return "home";
    }
}
