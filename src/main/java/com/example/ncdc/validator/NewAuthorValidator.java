package com.example.ncdc.validator;

import com.example.ncdc.model.AuthorModel;


public class NewAuthorValidator {
    public static boolean validate(AuthorModel newAuthor) {
        return newAuthor.getFirstName().matches("A.*") || newAuthor.getLastName().matches("A.*");
    }
}
