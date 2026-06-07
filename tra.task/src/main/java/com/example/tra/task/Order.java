package com.example.tra.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private  String orederId ;
    private String shippingAddress;
    private  String orderStatus;
}
