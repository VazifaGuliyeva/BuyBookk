package com.example.buybook.dto;

import com.example.buybook.entity.Category;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class CategoryDtoManager implements Function<Category,CategoryDto> {
    @Override
    public CategoryDto apply(Category category) {
        return new CategoryDto(category.getCategoryName());
    }
}
