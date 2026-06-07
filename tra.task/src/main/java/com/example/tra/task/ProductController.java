package com.example.tra.task;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


public class ProductController {
    Map<Integer, Product> productData = new HashMap<>();

    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable String id , @RequestParam Integer newStock){
        productData.put(1,new Product("1","Laptop",10));
        productData.put(1,new Product("2","Phone",20));

        if (productData.containsKey(id)){
            return "Product not found";
        }
        Product product =productData.get(id);
        Integer oldStock = product.getStockQuantity();

        product.setStockQuantity(newStock);


    }







}
