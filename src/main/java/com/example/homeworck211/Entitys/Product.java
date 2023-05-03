package com.example.homeworck211.Entitys;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;
@Component
@SessionScope
public class Product {
    private int id;
    Set<Integer> idSet = new HashSet<>();


    public Set<Integer> getId() {
        return idSet;
    }

    public void setId(int id) {
        idSet.add(id);
    }
}
