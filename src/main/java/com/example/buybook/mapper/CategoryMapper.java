package com.example.buybook.mapper;

import com.example.buybook.dto.CategoryDto;
import com.example.buybook.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDto toCategoryDto(Category category);
    Category categoryEntity(CategoryDto categoryDto);
}
