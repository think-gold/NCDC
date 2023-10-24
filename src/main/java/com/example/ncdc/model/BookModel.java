package com.example.ncdc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class BookModel {
    @Id
    private String isbn;                      // primary-key
    private String title;


    @ManyToOne
    private AuthorModel author;
}
