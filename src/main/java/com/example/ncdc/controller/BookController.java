package com.example.ncdc.controller;

import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.model.BookModel;
import com.example.ncdc.service.AuthorService;
import com.example.ncdc.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class BookController {
    private final BookService bookService;
    private final AuthorService authorService;

    @GetMapping("/books")
    public String getBooksList(Model model) {

        List<BookModel> booksList = bookService.getBooksList();
        if (booksList.size() == 0) {
            System.out.println("No records to show");
            log.warn("Cannot show records. List of books is empty.");
        }
        model.addAttribute("bookModel", booksList);
        log.info("Showing books - success.");
        return "books/booksList";
    }

    @GetMapping("/addBook")
    public String getAddBook(Model model) {
        List<AuthorModel> authorsList = authorService.getAuthorsList();
        model.addAttribute("authorModel", authorsList);
        return "books/addBook";
    }

    @PostMapping("/addBook")
    public RedirectView postAddBook(BookModel book) {
        bookService.addBook(book);
        log.info("New book added");
        return new RedirectView("/books");
    }


}
