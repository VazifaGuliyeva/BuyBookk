package com.example.buybook.controller;

import com.example.buybook.dto.AuthorDto;
import com.example.buybook.dto.AuthorPageResponse;
import com.example.buybook.entity.Author;
import com.example.buybook.manager.AuthorManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    Logger logger= LoggerFactory.getLogger(AuthorController.class);

    private final AuthorManager authorManager;

    public AuthorController(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @GetMapping
    public AuthorPageResponse getAll(@RequestParam(value="page")int page, @RequestParam(value="count") int count){
        logger.info("getAll request accepted");

        return authorManager.getAll(page,count);
    }
    @GetMapping("/{id}")
    public AuthorDto getById(@PathVariable int id){
        logger.info("getId request accepted");

        return authorManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addAuthor(@RequestBody AuthorDto authorDto){
        authorManager.addAuthor(authorDto);
    }
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id){
        authorManager.deleteAuthor(id);
    }


}
