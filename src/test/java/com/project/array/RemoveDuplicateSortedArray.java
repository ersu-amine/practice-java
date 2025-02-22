package com.project.array;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        //ordered array, max number is the last one
        // mark duplicate ones as the biggest number
        int max = nums[nums.length - 1] + 1;

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

        return size;


    }
}
