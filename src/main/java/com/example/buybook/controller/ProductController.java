package com.example.buybook.controller;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.entity.Product;
import com.example.buybook.manager.ProductManager;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductManager productManager;


    public ProductController(ProductManager productManager) {
        this.productManager = productManager;
    }
    @GetMapping
    public List<ProductDto> getAll(){
        return productManager.getAll();
    }
    @GetMapping("/{id}")
    public ProductDto getById(int id){
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
