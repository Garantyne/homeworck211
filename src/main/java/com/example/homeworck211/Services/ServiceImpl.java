package com.example.homeworck211.Services;

import com.example.homeworck211.Entitys.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements Services {
    private Product product;
    List<Product> prod = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        prod.add(product);
    }

    @Override
    public List <Product> getProduct() {
        return prod;
    }
}
