package org.pa.library.model;

import java.util.List;

public class Author {
    private String name;
    private String surname;
    private List<Book> books;

    public Author() {
        this.name = "";
        this.surname = "";
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public List<Book> getBooks() {
        return this.books;
    }

}
