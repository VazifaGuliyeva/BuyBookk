package com.example.buybook.mapper;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto toProductDto(Product product);

    Product toProductEntity(ProductDto productDto);
}
