package com.example.ncdc.validator;

import com.example.ncdc.model.AuthorModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class NewAuthorValidatorTest {
    @Test
    void ShouldCheckIfInputMeetsFirstNameCriteria() {
        //given
        AuthorModel authorModel1 = new AuthorModel();
        authorModel1.setFirstName("Franek");
        authorModel1.setLastName("Kimono");

        AuthorModel authorModel2 = new AuthorModel();
        authorModel2.setFirstName("Alicja");
        authorModel2.setLastName("Puchatek");
        //when
        boolean result = NewAuthorValidator.validate(authorModel1);
        boolean result2 = NewAuthorValidator.validate(authorModel2);
        //then
        assertThat(result).isFalse();
        assertThat(result2).isTrue();
    }

    @Test
    void ShouldCheckIfInputMeetsLastNameCriteria() {
        //given
        AuthorModel authorModel1 = new AuthorModel();
        authorModel1.setFirstName("Franek");
        authorModel1.setLastName("Kimono");

        AuthorModel authorModel2 = new AuthorModel();
        authorModel2.setFirstName("Katarzyna");
        authorModel2.setLastName("Andrut");
        //when
        boolean result = NewAuthorValidator.validate(authorModel1);
        boolean result2 = NewAuthorValidator.validate(authorModel2);
        //then
        assertThat(result).isFalse();
        assertThat(result2).isTrue();
    }
}