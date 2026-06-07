package com.example.tra.task.Controller;

import com.example.tra.task.Entity.Product1;
import com.example.tra.task.Services.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    ProductService productService;

   @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){

   }

}
