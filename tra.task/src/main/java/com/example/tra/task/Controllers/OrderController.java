package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    Map<Integer, Order> orderData = new HashMap<>();


    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String shippingAddress, @RequestParam String orderStatus) {
        orderData.put(1, new Order(1, "Muscat, Oman", "Pending"));

        if (!orderData.containsKey(orderId)) {
            return "Order Not Found";
        }
        Order order = orderData.get(orderId);

        String oldAddress = order.getShippingAddress();
        String oldStatus = order.getOrderStatus();

        order.setShippingAddress(shippingAddress);
        order.setOrderStatus(orderStatus);


        return "Order Updated Successfully\n"
                + "Order ID: " + order.getOrderId() + "\n"
                + "Old Address: " + oldAddress + " → New: " + order.getShippingAddress() + "\n"
                + "Old Status: " + oldStatus + " → New: " + order.getOrderStatus();
    }


}



