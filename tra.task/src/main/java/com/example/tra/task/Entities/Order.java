package com.example.tra.task.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private  Integer orederId ;
    private String shippingAddress;
    private  String orderStatus;
}
