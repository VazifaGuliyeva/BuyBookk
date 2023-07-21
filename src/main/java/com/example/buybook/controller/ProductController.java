package com.example.buybook.controller;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.dto.ProductPageResponse;
import com.example.buybook.entity.Product;
import com.example.buybook.manager.ProductManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    Logger logger= LoggerFactory.getLogger(ProductController.class);

    private final ProductManager productManager;


    public ProductController(ProductManager productManager) {
        this.productManager = productManager;
    }
    @GetMapping
    public ProductPageResponse getAll(@RequestParam(value="page")int page, @RequestParam(value="count") int count){
        logger.info("getAll request accepted");

        return productManager.getAll(page,count);
    }
    @GetMapping("/{id}")
    public ProductDto getById(int id){
        logger.info("getId request accepted");

        return productManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductDto productDto){
        productManager.addProduct(productDto);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productManager.deleteProduct(id);
    }
}
