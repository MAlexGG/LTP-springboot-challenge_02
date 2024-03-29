package com.ltp.globalsuperstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StoreController {

    List<Item> products = new ArrayList<>(); 
    
    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("categories", Constants.CATEGORIES);
        return "form";
    }
    
    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("products", products);
        return "inventory";
    }

    @PostMapping("/inventory")
    public String submitForm(Item item) {
        products.add(item);
        return "redirect:/inventory";
    }
    
    

    

}
