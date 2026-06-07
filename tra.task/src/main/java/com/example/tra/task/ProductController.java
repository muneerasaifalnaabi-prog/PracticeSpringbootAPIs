package com.example.tra.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ProductController {
    Map<Integer, Product> productData = new HashMap<>();

    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable String id, @RequestParam Integer newStock) {


        if (!productData.containsKey(id)) {
            return "Product not found";
        }
        Product product = productData.get(id);
        Integer oldStock = product.getStockQuantity();

        product.setStockQuantity(newStock);

        return "Product Updated Successfully\n"
                + "Product Name: " + product.getProductName() + "\n"
                + "Previous Stock: " + oldStock + "\n"
                + "Updated Stock: " + product.getStockQuantity();


    }


}
