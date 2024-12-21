package com.project.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicates {//from sorted array

    public int removeDuplicates(int[] nums) {
        //ordered array, max number is the last one
        // mark duplicate ones as the biggest number
        int max = nums[nums.length-1] +1;

        //keep track of how many duplicates were there
        int size = nums.length;

        //iterate and set each duplicated number as the max number
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = max;
                size--;
            }
        }
        //duplicates are moved to the left after sort
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        return size;

    }

    @Test
    void test1() {
        removeDuplicates(new int[]{1, 1, 2,});
    }

    @Test
    void test2() {
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
}
