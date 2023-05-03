package com.example.homeworck211.Services;

import com.example.homeworck211.Entitys.Product;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServiceImpl implements Services {
    private final Product product;


    public ServiceImpl(Product product) {
        this.product = product;
    }

    @Override
    public void addProduct(int id) {
        product.setId(id);
    }

    @Override
    public Set<Integer> getProduct() {
        return product.getId();
    }
}
