package com.example.Product.Catalog.Controller;

import com.example.Product.Catalog.Entity.ProductEntity;
import com.example.Product.Catalog.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    //add the product
    @PostMapping("/save")
    public String saveTheProduct(@ModelAttribute ProductEntity productEntity){
        productService.saveTheProduct(productEntity);
        return "redirect:/";
    }

    @GetMapping("/addProduct")
    public String productRegister(){
        return "addProduct";
    }

    //findAll to display the product
    @GetMapping("/displayProduct")
    public ModelAndView getAllProducts(){
        List<ProductEntity>list=productService.getAllProduct();
        return new ModelAndView("displayProduct","ProductEntity",list);
    }

}
