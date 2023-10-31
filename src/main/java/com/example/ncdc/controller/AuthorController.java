package com.example.ncdc.controller;

import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.service.AuthorService;
import com.example.ncdc.validator.NewAuthorValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/authors")
    public String getAuthors(Model model) {
        List<AuthorModel> authorsList = authorService.getAuthorsList();
        model.addAttribute("authorModel", authorsList);
        log.info("Showing list of authors.");
        return "authors/authorsList";
    }

    @GetMapping("/addAuthor")
    public String getAddAuthor() {
        return "authors/addAuthor";
    }

    @PostMapping("/addAuthor")
    public RedirectView postAddAuthor(AuthorModel author, RedirectAttributes redirectAttributes) {
        if (NewAuthorValidator.validate(author)) {
            authorService.addAuthor(author);
            log.info("Adding new author - success.");
            return new RedirectView("/authors");
        }
        else{
            String message ="First name or last name needs to start with letter A";
            redirectAttributes.addFlashAttribute("validationError", message);
            log.warn("Input doesn't meet criteria in validator.");
            return new RedirectView("/addAuthor");
        }

    }

}
