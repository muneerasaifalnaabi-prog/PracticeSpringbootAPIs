package com.example.tra.task.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private  Integer orderId ;
    private String shippingAddress;
    private  String orderStatus;
}
