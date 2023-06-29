package com.example.buybook.controller;


import com.example.buybook.entity.Category;
import com.example.buybook.manager.CategoryManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    private final CategoryManager categoryManager;


    public CategoryController(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }
    @GetMapping("/categories")
    public List<Category> getAll(){
        return categoryManager.getAll();

    }
    @GetMapping("/categories/{id}")
    public Category getById(@PathVariable int id){
        return categoryManager.getById(id);
    }
    @PostMapping("/categories")
    public void addCategory(@RequestBody Category category){
        categoryManager.addCategory(category);
    }
    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryManager.deletecategory(id);
    }
}
