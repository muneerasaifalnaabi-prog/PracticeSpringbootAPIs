package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ProductController {
    Map<Integer, Product> productData = new HashMap<>();


    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable Integer id, @RequestParam Integer newStock) {
        productData.put(1, new Product(1, "Laptop", 10));
        productData.put(2, new Product(2, "Phone", 20));

        if (!productData.containsKey(id)) {
            return "Product not found";
        }
        Product product = productData.get(id);
        Integer oldStock = product.getStockQuantity();

        product.setStockQuantity(newStock);

        return "Product Updated Successfully\n "
                + "Product Name: " + product.getProductName() + "\n"
                + "Previous Stock: " + oldStock + "\n"
                + "Updated Stock: " + product.getStockQuantity();


    }


}
