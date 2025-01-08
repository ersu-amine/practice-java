package com.project.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FirstDuplicateElement {
    /*
            Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

            A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */

    public static int findDuplicate(int[] nums) {
        //iterate and compare to following numbers in an array
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {

                if (nums[i] == nums[k]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    @Test
    void test1() {
        int[] nums = new int[]{5, 6, 7, 4, 5, 4, 3, 6};
        System.out.println(findDuplicate(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{5, 1, -1, 3};
        System.out.println(findDuplicate(nums));
    }
}
