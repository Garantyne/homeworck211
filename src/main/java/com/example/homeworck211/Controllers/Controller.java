package com.example.homeworck211.Controllers;

import com.example.homeworck211.Entitys.Product;
import com.example.homeworck211.Services.Services;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = ("/store/order"))
public class Controller {
    public final Services services;

    public Controller(Services services) {
        this.services = services;
    }

    @GetMapping
    public String well(){
        return "well";
    }
    @GetMapping(path = "/add")
    public void prod(@RequestParam("idi") int id){
        services.addProduct(new Product(id));

    }
    @GetMapping(path = "/get")
    public List<Product> prod(){
        return services.getProduct();
    }
}
