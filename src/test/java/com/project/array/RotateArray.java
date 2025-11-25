package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArray {
    /*
    Rotate Array by K Steps

Write a Java method that rotates an integer array to the right by k positions without using extra arrays (do the rotation in-place).

Example:
Input: nums = [1,2,3,4,5,6], k = 2
Output: [5,6,1,2,3,4]
     */

    @Test
    void test() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedNums = new int[]{3, 4, 5, 6, 1, 2};
        Assertions.assertArrayEquals(expectedNums, rotateArray(nums, 4));
    }

    public static int[] rotateArray(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            int num = array[array.length - 1];
            for (int j = array.length - 2; j >= 0; j--) {
                array[j + 1] = array[j];
            }
            array[0] = num;
        }
        return array;
    }
}
