package com.example.tra.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private  String pid;
    private  String productName;
    private  Integer stockQuantity;

}
