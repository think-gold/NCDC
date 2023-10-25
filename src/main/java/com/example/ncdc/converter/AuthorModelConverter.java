package com.example.ncdc.converter;

import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class AuthorModelConverter implements Converter<String, AuthorModel> {

    @Autowired
    private AuthorService service;

    @Override
    public AuthorModel convert(String source) {
        System.out.println(source);

        return service.getAuthorsList().stream()
                .filter(author -> author.getLastName().equals(source))
                .findFirst()
                .orElse(null);
    }
}