package com.example.ncdc.controller;

import com.example.ncdc.converter.AuthorModelConverter;
import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.service.AuthorService;
import com.example.ncdc.validator.NewAuthorValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/authors")
    public String getAuthors(Model model) {
        List<AuthorModel> authorsList = authorService.getAuthorsList();
        model.addAttribute("authorModel", authorsList);
        return "authors/authorsList";
    }

    @GetMapping("/addAuthor")
    public String getAddAuthor() {
        return "authors/addAuthor";
    }

    @PostMapping("/addAuthor")
    public RedirectView postAddAuthor(AuthorModel author) {
        if (NewAuthorValidator.validate(author)) {
            authorService.addAuthor(author);
            return new RedirectView("/authors");
        }
        else{
            System.out.println("First name or Last name needs to start with letter A");
            return new RedirectView("/addAuthor");
        }

    }

}
