package com.example.buybook.manager;

import com.example.buybook.dto.AuthorDto;
import com.example.buybook.dto.AuthorDtoManager;
import com.example.buybook.dto.AuthorPageResponse;
import com.example.buybook.entity.Author;
import com.example.buybook.exception.AuthorNotFoundException;
import com.example.buybook.mapper.AuthorMapper;
import com.example.buybook.repository.AuthorRepository;
import com.example.buybook.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    private final AuthorMapper authorMapper;


    @Override
    public AuthorPageResponse getAll(int page, int count) {
      //  public List<AuthorDto> getAll(int page,int count) {

        Page<Author> authorPage=authorRepository.findAll(PageRequest.of(page,count));

        return new AuthorPageResponse(
                authorPage.getContent().stream().map(authorMapper::toAuthorDto).toList(),
                authorPage.getTotalElements(),
                authorPage.getTotalPages(),
                authorPage.hasNext()
        );
    }

    @Override
    public AuthorDto getById(int id) {
        return authorRepository.findById(id).stream().
                map(authorMapper::toAuthorDto).
                findFirst().orElseThrow(()-> new AuthorNotFoundException("Author tapilmadi"));
    }

    @Override
    public void addAuthor(AuthorDto authorDto) {

        authorRepository.save(authorMapper.toAuthorEntity(authorDto));
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);

    }
}
