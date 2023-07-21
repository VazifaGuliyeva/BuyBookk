package com.example.buybook.controller;


import com.example.buybook.dto.CategoryDto;
import com.example.buybook.dto.CategoryPageResponse;
import com.example.buybook.entity.Category;
import com.example.buybook.manager.CategoryManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    Logger logger= LoggerFactory.getLogger(CategoryController.class);

    private final CategoryManager categoryManager;


    public CategoryController(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }
    @GetMapping
    public CategoryPageResponse getAll(@RequestParam(value="page") int page, @RequestParam(value="count") int count){
        logger.info("getAll request accepted");
        return categoryManager.getAll(page,count);

    }
    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable int id){
        logger.info("getId reqeust accepted");
        return categoryManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addCategory(@RequestBody CategoryDto categoryDto){
        categoryManager.addCategory(categoryDto);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryManager.deletecategory(id);
    }
}
