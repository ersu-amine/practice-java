package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RunningSum {
    /*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
     */

    public int[] runningSum(int[] nums) {
        //make new array
        int [] array = new int[nums.length];

        //first element is the initial number in the array
        array[0] = nums[0];

        //iterate and add sum to the array, starting from the second element
        for (int i = 1; i < nums.length; i++) {
            //previous + current
            array[i] = array[i-1] + nums[i];
        }
        return array;

    }

    @Test
    void test1() {
        int[] nums = {1,2,3,4};
        int[] array =new int[]{1,3,6,10};

        Assertions.assertArrayEquals(array,runningSum(nums));
    }

    @Test
    void test2() {
        int[] nums = {3,1,2,10,1};
        int[] array =new int[]{3,4,6,16,17};

        Assertions.assertArrayEquals(array,runningSum(nums));
    }
}
