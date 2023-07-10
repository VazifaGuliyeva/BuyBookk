package com.example.buybook.service;

import com.example.buybook.dto.AuthorDto;
import com.example.buybook.entity.Author;

import java.util.List;

public interface AuthorService {

    List<AuthorDto> getAll();

    AuthorDto getById(int id);

    void addAuthor(Author author);

    void deleteAuthor(int id);
}
