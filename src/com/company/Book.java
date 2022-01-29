package com.company;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private Integer publicationYear;

    public Book (String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName () {
        return this.bookName;
    }

    public Author getAuthor () {
        return this.author;
    }

    public int getPublicationDate () {
        return this.publicationYear;
    }

    public void setPublicationYear (int year) {
        this.publicationYear = year;
    }

    public String getFullBookDescription () {
        return this.bookName + " by " + this.getAuthor().getAuthorFirstName()
                + " " + this.getAuthor().getAuthorLastName()
                + " published on " + this.publicationYear + ".";
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author) && publicationYear.equals(book.publicationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicationYear);
    }
}