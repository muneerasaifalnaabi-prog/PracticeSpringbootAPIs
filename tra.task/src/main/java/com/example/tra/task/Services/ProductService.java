package com.example.tra.task.Services;

import com.example.tra.task.Entity.Product;

import java.util.HashMap;

public class ProductService {
    HashMap<Integer, Product> productMap = new HashMap<>();

    public void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    public  String deleteProductById(Integer pid){

    }


}
