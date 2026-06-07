package com.example.tra.task.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private  Integer pid;
    private  String productName;
    private  Integer stockQuantity;
}
