package com.example.ncdc.validator;

import com.example.ncdc.model.AuthorModel;


public class NewAuthorValidator {
    public static void validate(AuthorModel newAuthor){
        if(!newAuthor.getFirstName().matches("A.*")||!newAuthor.getLastName().matches("A.*")){
            System.out.println("First name or Last name should start with letter A");
        }
    }
}
