package com.example.ncdc.service;

import com.example.ncdc.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }

//    public void createBook(CreateBookDTO createBookDTO) {
//       bookRepository.save(createBookDTO);
//    }
}
