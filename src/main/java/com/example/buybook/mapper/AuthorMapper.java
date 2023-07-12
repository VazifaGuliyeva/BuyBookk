package com.example.buybook.mapper;

import com.example.buybook.dto.AuthorDto;
import com.example.buybook.entity.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") //spring load olanda AuthorMapper-in taninmasi ucun mapper kimi
public interface AuthorMapper {

    AuthorDto toAuthorDto(Author author);

    Author toAuthorEntity(AuthorDto authorDto);
}
