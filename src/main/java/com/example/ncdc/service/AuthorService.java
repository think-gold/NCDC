package com.example.ncdc.service;

import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public void addAuthor(AuthorModel author) {
        authorRepository.save(author);
    }

    public List<AuthorModel> getAuthorsList() {
        return authorRepository.findAll();
    }
}
