package com.example.ncdc.service;

import com.example.ncdc.model.BookModel;
import com.example.ncdc.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void addBook(BookModel book) {
        bookRepository.save(book);
    }

//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }


}
