package com.example.ncdc.controller;

import com.example.ncdc.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("api/addAuthor")
    public String getAddAuthor(){
        return "authors/addAuthor";
    }
}
