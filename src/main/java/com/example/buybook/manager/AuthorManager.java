package com.example.buybook.manager;

import com.example.buybook.entity.Author;
import com.example.buybook.repository.AuthorRepository;
import com.example.buybook.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component-Component ve service demek olar eynidir,sadece service daha cox uygun gelir //Spring proyektin beanlerini taniya bilsin
@Service
@AllArgsConstructor
public class AuthorManager implements AuthorService {

    private final AuthorRepository authorRepository;

   /* public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }*/


    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author getById(int id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);

    }
}
