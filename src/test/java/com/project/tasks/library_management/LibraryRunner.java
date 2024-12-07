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
        do{
            System.out.println("   Enter your choice: ");
            choice = scan.nextInt();

        } while (choice!=5);



    }
}
