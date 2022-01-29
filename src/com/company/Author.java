package com.company;

import java.lang.constant.Constable;

public class Author {
    private String firstName;
    private String lastName;

    public Author( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final String getAuthorFirstName () {
        return this.firstName;
    }
    public final String getAuthorLastName () {
        return this.lastName;
    }

    public final String getFullAuthorsName () {
        return this.firstName + " " + this.lastName;
    }
}