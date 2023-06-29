package com.example.buybook.service;

import com.example.buybook.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category getById(int id);

    void addCategory(Category category);

    void deletecategory(int id);
}
