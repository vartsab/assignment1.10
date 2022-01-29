package com.company;

import java.lang.constant.Constable;
import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorFirstName () {
        return this.firstName;
    }
    public String getAuthorLastName () {
        return this.lastName;
    }

    public String getFullAuthorsName () {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}