package com.project.numbers;

import org.junit.jupiter.api.Test;

public class SwapNumbers {

    @Test
    void swapWithTemp() {
        int i = 1, j = 5;
        //with temporary variable
        int k = i; // k=1
        i=j; //i=5
        j=k; //j=1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    @Test
    void swapWithoutTemp() {
        int i = 1, j = 5;
        //without temporary variable
        j = j+i; //j=6
        i=j-i; // i = 6-1, i = 5
        j=j-i; // j = 6-5, j = 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
