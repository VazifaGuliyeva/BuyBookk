package com.example.buybook.service;

import com.example.buybook.dto.AuthorDto;
import com.example.buybook.dto.AuthorPageResponse;
import com.example.buybook.entity.Author;

import java.util.List;

public interface AuthorService {

   AuthorPageResponse getAll(int page, int count);

    AuthorDto getById(int id);

    void addAuthor(AuthorDto authorDto);

    void deleteAuthor(int id);
}
