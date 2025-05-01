package com.project.array;

import org.junit.jupiter.api.Test;


public class AddUpToSum {


       /*
        Add Up to Sum

        Given an int array and an int representing the sum number, create a program that can find the pair of numbers from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum

        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
     */

    public static void addUpToSum(int[] nums, int sum){
        //use nested loop to check sum of each number from outer loop with inner loop number
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if(nums[i] + nums[k] == sum && nums[i] != nums[k]){
                    System.out.println(nums[i] + " & " + nums[k]);
                }
            }
        }
    }

    @Test
    void test() {
        int[] nums = new int[]{2,3,5,0,6,1};
        addUpToSum(nums,6);
    }
}
