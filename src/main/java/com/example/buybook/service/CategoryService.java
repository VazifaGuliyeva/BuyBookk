package com.example.buybook.service;

import com.example.buybook.dto.CategoryDto;
import com.example.buybook.dto.CategoryPageResponse;
import com.example.buybook.entity.Category;

import java.util.List;

public interface CategoryService {

    CategoryPageResponse getAll(int page, int count);

    CategoryDto getById(int id);

    void addCategory(CategoryDto categoryDto);

    void deletecategory(int id);
}
