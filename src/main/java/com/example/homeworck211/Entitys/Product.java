package com.example.homeworck211.Entitys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


@Scope("Session")
public class Product {
    private int id;
    public Product(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
