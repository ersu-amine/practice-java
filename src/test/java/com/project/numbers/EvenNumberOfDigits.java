package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumberOfDigits {
    /*
    Given an array nums of integers, return how many of them contain an even number of digits.
        Example 1:

        Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.

        Example 2:

        Input: nums = [555,901,482,1771]
        Output: 1
        Explanation:
        Only 1771 contains an even number of digits.
     */

    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length ; i++) {
            String digitStr = String.valueOf(nums[i]);
            if(digitStr.length()%2==0){
                counter++;
            }
        }
        return counter;

    }

    @Test
    void test1() {
        int[] array = new int[]{1993, 12, 30, 7, 14, 21, 222};

        Assertions.assertEquals(5, findNumbers(array));
    }
}
