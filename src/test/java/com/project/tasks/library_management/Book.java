package com.project.tasks.library_management;

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
    public boolean isAvailable;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
