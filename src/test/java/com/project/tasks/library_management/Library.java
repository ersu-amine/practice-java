package com.project.tasks.library_management;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /*
    Library: Manages a collection of books and provides functionality to:
        Add a new book
        Borrow a book (by ISBN)
        Return a book (by ISBN)
        Display all books with their availability status

        Add a Book: Allow adding new books to the library.
        Borrow a Book: If a book is available, mark it as borrowed. If not, notify the user.
        Return a Book: Allow returning a borrowed book and mark it as available again.
        View Inventory: Display all books with details (title, author, ISBN, and availability).

        Implementation Details:
        Use a List<Book> to store the books in the library.
        Use loops and conditionals to handle user input and actions.
        Provide a text-based menu for user interaction (use Scanner for input).

        Menu Example:
        Welcome to the Library Management System
        1. Add Book
        2. Borrow Book
        3. Return Book
        4. View Inventory
        5. Exit
        Enter your choice:

     */

    //TODO implement a way to fill inventory before addition of book by user, inventory is null
    public static List<Book> inventory;
    public static List<Book> borrowedBooks = new ArrayList<>();

    public static void addBook(Book book){
        //add book to the collection of book
        inventory.add(book);
    }

    public static void borrowBook(Book book){
        inventory.remove(book);
        borrowedBooks.add(book);
    }

    public static void returnBook(Book book){
        inventory.add(book);
        borrowedBooks.remove(book);
    }

    public static void viewInventory(){
        System.out.println("The inventory: ");
        for (Book book : inventory) {
            System.out.println(book.getTitle());
        }
    }

    public static List<String> getBookTitles(List<Book> books){
        List<String> allTitles = new ArrayList<>();
        for (Book book : books) {
            allTitles.add(book.getTitle());
        }
        return allTitles;
    }

    public static Book getInventoryBook(String bookTitle){
        Book book = null;
        for (Book eachBook : inventory) {
            if(eachBook.getTitle().equals(bookTitle)){
                //assign book if it is in the inventory
                book = eachBook;
            }
        }
        return book;
    }

    public static Book getBorrowedBook(String bookTitle){
        Book book = null;
        for (Book eachBook : borrowedBooks) {
            if(eachBook.getTitle().equals(bookTitle)){
                //assign book if it is in the inventory
                book = eachBook;
            }
        }
        return book;
    }
}
