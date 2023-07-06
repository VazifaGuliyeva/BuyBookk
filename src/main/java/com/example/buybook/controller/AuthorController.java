package com.example.buybook.controller;

import com.example.buybook.entity.Author;
import com.example.buybook.manager.AuthorManager;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    private final AuthorManager authorManager;

    public AuthorController(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @GetMapping
    public List<Author> getAll(){
        return authorManager.getAll();
    }
    @GetMapping("/{id}")
    public Author getById(@PathVariable int id){
        return authorManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addAuthor(@RequestBody Author author){
        authorManager.addAuthor(author);
    }
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id){
        authorManager.deleteAuthor(id);
    }


}
