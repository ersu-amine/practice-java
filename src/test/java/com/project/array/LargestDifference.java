package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class LargestDifference {
    /*
    4. Find the Largest Difference Between Two Elements in an Array

    Write a Java program that calculates the maximum difference between two elements in an array, where the larger number comes after the smaller number.

        Example:
        Input → {7, 1, 5, 3, 6, 4}
        Output → Largest difference is 5
     */

    @Test
    void test() {
        Assertions.assertEquals(5,largestDifference(new int[] {7,1,5,3,6,4}));
    }

    public static int largestDifference(int[] nums){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                list.add(nums[j]-nums[i]);
            }
        }
        return Collections.max(list);
    }
}
