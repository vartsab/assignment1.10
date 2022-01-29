package com.company;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("John Ronald Reuel", "Tolkien");
        Author heller = new Author("Joseph", "Heller");

        Book fellowship = new Book("The Fellowship of the Ring", tolkien,  1954);
        Book catch22 = new Book("Catch-22", heller, 1961);

        System.out.println("catch22.getBookName() = " + catch22.getBookName());
        System.out.println("fellowship.getFullBookDescription() = " + fellowship.getFullBookDescription());

        fellowship.setPublicationYear(1955);
        System.out.println("fellowship.getFullBookDescription() = " + fellowship.getFullBookDescription());

    }

}