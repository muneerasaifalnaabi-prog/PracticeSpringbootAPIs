package com.example.tra.task.Controller;

import com.example.tra.task.Entity.Product1;
import com.example.tra.task.Services.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    ProductService productService;


}
