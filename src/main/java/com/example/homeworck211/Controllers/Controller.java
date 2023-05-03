package com.example.homeworck211.Controllers;

import com.example.homeworck211.Services.Services;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class Controller {
    public final Services services;

    public Controller(Services services) {
        this.services = services;
    }
    @GetMapping("/add")
    public void prod(@RequestParam int id){
        services.addProduct(id);
    }
    @GetMapping("/get")
    public Set<Integer> prod(){
        return services.getProduct();
    }
}