package com.example.buybook.controller;

import com.example.buybook.entity.Author;
import com.example.buybook.manager.AuthorManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    private final AuthorManager authorManager;

    public AuthorController(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @GetMapping("/authors")
    public List<Author> getAll(){
        return authorManager.getAll();
    }
    @GetMapping("/authors/{id}")
    public Author getById(@PathVariable int id){
        return authorManager.getById(id);
    }
    @PostMapping("/authors")
    public void addAuthor(@RequestBody Author author){
        authorManager.addAuthor(author);
    }
    @DeleteMapping("/authors/{id}")
    public void deleteAuthor(@PathVariable int id){
        authorManager.deleteAuthor(id);
    }


}
