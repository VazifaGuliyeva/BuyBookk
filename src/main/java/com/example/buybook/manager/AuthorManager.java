package com.example.buybook.manager;

import com.example.buybook.dto.AuthorDto;
import com.example.buybook.dto.AuthorDtoManager;
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
    private final AuthorDtoManager authorDtoManager;


    @Override
    public List<AuthorDto> getAll() {
        return authorRepository.findAll().stream().map(authorDtoManager).toList();
    }

    @Override
    public AuthorDto getById(int id) {
        return authorRepository.findById(id).stream().map(authorDtoManager).findFirst().get();
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
