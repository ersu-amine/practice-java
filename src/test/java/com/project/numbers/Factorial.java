package com.project.numbers;

import java.util.Scanner;

public class Factorial {
    /*
    Question: Write a Java program to find Factorial of a given number.

    The factorial of a number (n!) is the product of all positive integers from 1 to n. It is commonly used in mathematical computations, permutations, and algorithmic problem-solving.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please  enter a number");
        int number = scan.nextInt();
        System.out.print("The factorial for the given number is: ");
        System.out.println(getFactorial(number));
    }

    public static int getFactorial(int num) {
        int factorial = 1; // zero factorial is 1
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
