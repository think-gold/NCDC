package com.example.ncdc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Book extends BaseEntity {
    private String title;
    private String isbn;                      // primary-key

    @ManyToOne
    private Author author;
}
