package com.example.homeworck211.Services;

import com.example.homeworck211.Entitys.Product;

import java.util.List;

public interface Services {
    public void addProduct(Product product);

    public List<Product> getProduct();
}
