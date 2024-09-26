package com.thecodereveal.shopease.controllers;

import com.thecodereveal.shopease.dto.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<ProductDto> getAllProduct(){
        return Collections.EMPTY_LIST;
    }


//create product
    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto product){
        return null;
    }

}
