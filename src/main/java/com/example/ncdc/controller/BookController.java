package com.example.ncdc.controller;

import com.example.ncdc.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/books")
    public String getBooksList(){
        return "books/booksList";
    }

    @GetMapping("/addBook")
    public String getAddBook(){
        return "books/addBook";
    }



//    @GetMapping
//    public List<Book> getListOfBooks(){
//       return bookService.getAllBooks();
//    }

//    @PostMapping("/api/addBook")
//    public void createBook(CreateBookDTO createBookDTO){
//        return bookService.createBook(createBookDTO);
//    }

}
