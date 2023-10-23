package com.example.ncdc.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Author extends BaseEntity{
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="author")
    private Set<Book> books = new HashSet<>();
}
