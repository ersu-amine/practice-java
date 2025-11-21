package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumber {
    /*
        1. Find the Missing Number in an Array (1 to n)
        You are given an array of size n-1 containing numbers from 1 to n, with one number missing.
        Find the missing number.
            Example:
            Input → {1, 2, 4, 5}
            Output → 3
     */

    @Test
    void test() {
        int[] array = {1, 2, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};


        Assertions.assertEquals(3, findMissingNum(array));
        Assertions.assertEquals(6, findMissingNum(array2));
    }

    public static int findMissingNum(int[] array) {
        int num = 0;
        //assuming the array has first number as 1 always
        if (array[array.length - 1] != array.length + 1) { //check if the last number missing
            num = array.length + 1;
        } else { //check in between numbers
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] - array[i] != 1) {
                    num = array[i] + 1;
                    break;
                }
            }

        }
        System.out.println(num);
        return num;
    }
}
