package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DuplicateZeroes {
    /*
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

    Example 1:

    Input: arr = [1,0,2,3,0,4,5,0]
    Output: [1,0,0,2,3,0,0,4]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:

    Input: arr = [1,2,3]
    Output: [1,2,3]
    Explanation: After calling your function, the input array is modified to: [1,2,3]
     */

    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==0){

                for (int j = arr.length-1; j > i ; j-=1) {
                    arr[j] = arr[j-1];
                }
                i++;
                arr[i] = 0;
            }
        }
    }

    @Test
    void test1() {
        int[] array = new int[]{1, 0, 3, 0, 6, 10, 0};

        duplicateZeros(array);

        System.out.println(Arrays.toString(array));

        Assertions.assertArrayEquals(new int[]{1, 0, 0, 3, 0, 0, 6},array);

    }

    @Test
    void test2() {
        int[] array = new int[]{0, 0, 0, 0, 0, 0, 0};

        duplicateZeros(array);

        System.out.println(Arrays.toString(array));

        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0},array);

    }
}
