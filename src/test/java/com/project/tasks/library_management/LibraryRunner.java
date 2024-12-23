package com.project.tasks.library_management;

import java.util.Scanner;

public class LibraryRunner {
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
                    //TODO borrow book
//                case 2:
//                    System.out.println("Please enter the title of the book you want to borrow: ");
//                    String bookToBorrow = scan.nextLine();
//                    Library.borrowBook();
            }

        } while (choice != 5);

        System.out.println("Bye bye");


    }
}
