package com.project.tasks.library_management;

import java.util.List;
import java.util.Scanner;

public class LibraryRunner extends Library{
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System");
        System.out.println("   1. Add Book\n" +
                "   2. Borrow Book\n" +
                "   3. Return Book\n" +
                "   4. View Inventory\n" +
                "   5. Exit\n");
        int choice;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("   Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the title of the book: ");
                    String title = scan.nextLine();
                    System.out.println("Please enter the author of the book: ");
                    String author = scan.nextLine();
                    System.out.println("Please enter the isbn of the book: ");
                    String isbn = scan.nextLine();
                    Library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    System.out.println("Please enter the title of the book you want to borrow: ");
                    String bookToBorrow = scan.nextLine();
                    List<String> allTitles = Library.getBookTitles(Library.inventory);
                    if(allTitles.contains(bookToBorrow)){
                        Library.borrowBook(Library.getInventoryBook(bookToBorrow));

                    }else {
                        System.out.println("The book is not in the inventory. Please try later.");
                    }
                    break;
                case 3:
                    System.out.println("Please enter the title of the book you want to return: ");
                    String bookToReturn = scan.nextLine();
                    List<String> borrowedTitles = Library.getBookTitles(Library.borrowedBooks);
                    if(borrowedTitles.contains(bookToReturn)){
                        Library.returnBook(Library.getBorrowedBook(bookToReturn));

                    }else {
                        System.out.println("The book cannot be returned. Please try again later.");
                    }
                    break;
                case 4:
                    Library.viewInventory();
                    break;
            }

        } while (choice != 5);

        System.out.println("Bye bye");


    }
}
