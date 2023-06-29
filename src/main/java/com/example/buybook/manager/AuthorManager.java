package com.example.buybook.manager;

import com.example.buybook.entity.Author;
import com.example.buybook.service.AuthorService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component //Spring proyektin beanlerini taniya bilsin
public class AuthorManager implements AuthorService {
    private static List<Author> list=new ArrayList<>();

    static{
        list.add(new Author(1,"Chingiz Abdullazade"));
    }



    @Override
    public List<Author> getAll() {
        return list;
    }

    @Override
    public Author getById(int id) {
        return list.get(id-1);
    }

    @Override
    public void addAuthor(Author author) {
        list.add(author);

    }

    @Override
    public void deleteAuthor(int id) {
        list.remove(id-1);

    }
}
