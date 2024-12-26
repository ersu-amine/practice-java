package com.project.tasks.library_management;

import org.junit.jupiter.api.Test;

public class Book {
    /*
    Book: Represents a book with attributes:
title (String)
author (String)
isbn (String)
isAvailable (boolean)
     */

    public String title;
    public String author;
    public String isbn;
    public boolean isAvailable =true;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
