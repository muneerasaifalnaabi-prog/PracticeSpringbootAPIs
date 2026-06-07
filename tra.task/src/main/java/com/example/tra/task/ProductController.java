package com.example.tra.task;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;


public class ProductController {
    Map<Integer, Product> productData = new HashMap<>();

    public String updateStock(){
        productData.put(1,new Product(1,"Laptop",))
    }








}
