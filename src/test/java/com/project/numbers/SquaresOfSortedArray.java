package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SquaresOfSortedArray {
    /*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
        Example 1:

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].
        Example 2:

        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]
     */

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int square = nums[i] * nums[i];
            nums[i] = square;
        }
        Arrays.sort(nums);
        return nums;
    }

    @Test
    void test1() {
        int[] array = new int[]{1, -2, 0, 5, 7, 14};
        int[] result = new int[]{0, 1, 4, 25, 49, 196};
        Assertions.assertArrayEquals(result,sortedSquares(array));
    }
}
