package com.example.tra.task.Services;

import com.example.tra.task.Entities.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    HashMap<Integer, Product> productMap = new HashMap<>();
    public ProductService() {
        loadSampleProducts();
    }
    public void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    public String deleteProductById(Integer pid) {
        if (productMap.containsKey(pid)) {
            Product product = productMap.get(pid);
            productMap.remove(pid);
            return "Product Deleted Successfully\n"
                    + "Product ID: " + product.getPid() + "\n"
                    + "Product Name: " + product.getProductName();
        }
        return "product not found";

    }


}
