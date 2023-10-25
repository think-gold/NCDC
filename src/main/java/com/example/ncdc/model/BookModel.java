package com.example.ncdc.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


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
