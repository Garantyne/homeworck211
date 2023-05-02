package Controllers;

import Entitys.Product;
import Services.Services;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    public final Services services;

    public Controller(Services services) {
        this.services = services;
    }
    @GetMapping("/add")
    public void prod(@RequestParam int id){
        services.addProduct(new Product(id));
    }
    @GetMapping("/get")
    public List<Product> prod(){
        return services.getProduct();
    }
}
