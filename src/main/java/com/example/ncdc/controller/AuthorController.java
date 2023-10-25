package com.example.ncdc.controller;

import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.service.AuthorService;
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
        model.addAttribute("authotModel", authorsList);
        return "authors/authorsList";
    }


    @GetMapping("/addAuthor")
    public String getAddAuthor() {
        return "authors/addAuthor";
    }

    @PostMapping("/addAuthor")
    public RedirectView postAddAuthor(AuthorModel author){
        authorService.addAuthor(author);
        return new RedirectView("/authors");
    }

}
