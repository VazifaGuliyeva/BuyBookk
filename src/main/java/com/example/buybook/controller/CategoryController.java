package com.example.buybook.controller;


import com.example.buybook.dto.CategoryDto;
import com.example.buybook.entity.Category;
import com.example.buybook.manager.CategoryManager;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryManager categoryManager;


    public CategoryController(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }
    @GetMapping
    public List<CategoryDto> getAll(){
        return categoryManager.getAll();

    }
    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable int id){
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
