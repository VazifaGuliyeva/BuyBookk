package com.example.buybook.dto;

import com.example.buybook.entity.Author;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class AuthorDtoManager implements Function<Author,AuthorDto> {
    /*manager paketi icinde olan manager classinda uzun map icinde olan tekrar kodun qarsini almaq ucun
    Functiondan istifade edirik,hansi ki ozu birbasa Authoru AuthorDto-a cevirir apply metodu vasitesi ile*/
    @Override
    public AuthorDto apply(Author author) {
        return new AuthorDto(author.getAuthorName());
    }
}
