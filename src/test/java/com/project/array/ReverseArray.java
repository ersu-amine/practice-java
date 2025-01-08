package com.project.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReverseArray {

    //reverse given array

    //using new array
    public static int[] reverseArray(int[] nums){
        //create empty array, add from the last index to the first index
        int[] reverseNums = new int[nums.length];
        //keep track of index of the reverseNums
        int index = 0;
        for (int i = nums.length-1; i >=0; i--) {
            reverseNums[index]=nums[i];
            index++;
        }
        return reverseNums;
    }

    //by swapping values
    public static int[] reverseArrayWithSwap(int[] nums){
        //keep track of index of left and right
        int indexLeft = 0;
        int indexRight = nums.length-1;
        for (int i = 0; i< nums.length/2; i++) { //two value swapped at each iteration => iteration number / 2
            int temp = nums[indexLeft];
            nums[indexLeft] = nums[indexRight];
            nums[indexRight] = temp;
            indexLeft++;
            indexRight--;
        }
        return nums;
    }

    @Test
    void test1() {
        int[] nums = new int[]{1,5,6,9,0};

        System.out.println(Arrays.toString(reverseArray(nums)));
    }

    @Test
    void test2() {
        int[] nums = new int[]{5,8,6,3,2,8};

        System.out.println(Arrays.toString(reverseArrayWithSwap(nums)));
    }
}
