package com.project.numbers;

import org.junit.jupiter.api.Test;

public class Fibonacci {
    //fibonacci sequence
    // 1, 1, 2, 3, 5, 8, 13


    @Test
    void fibonacci() {
        fibonacciSequence(5);

        fibonacciSequence(8);
    }

    public static void fibonacciSequence(int term){
        int prev = 0;
        int current = 1;

        for (int i = 0; i < term; i++) {
            //display
            System.out.print( current + ", ");
            int temp = current;
            current = current + prev;
            prev = temp;

        }
        System.out.println();
    }
}
