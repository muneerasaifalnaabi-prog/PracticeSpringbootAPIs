package com.example.tra.task;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.HashMap;
import java.util.Map;


public class ProductController {
    Map<Integer, Product> productData = new HashMap<>();

    @PutMapping("/updateStock/{id}")
    public String updateStock(){
        productData.put(1,new Product("1","Laptop",10));
        productData.put(1,new Product("2","Phone",20));

    }







}
