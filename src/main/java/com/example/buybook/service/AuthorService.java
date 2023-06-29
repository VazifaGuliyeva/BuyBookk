package com.example.buybook.service;

import com.example.buybook.entity.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAll();

    Author getById(int id);

    void addAuthor(Author author);

    void deleteAuthor(int id);
}
