package com.project.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CombineArrays {
    /*
        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */

    public static int[] combineArray(int[] nums1, int[] nums2) {
        //create empty array with combine length of nums1 and nums2
        int[] combinedArray = new int[nums1.length + nums2.length];

        //add using for loop
        for (int i = 0; i < nums1.length; i++) {
            combinedArray[i] = nums1[i];
        }

        int index = 0; //index of number is the second array
        for (int j = nums1.length; j < combinedArray.length; j++) {
            combinedArray[j] = nums2[index];
            index++;
        }

        return combinedArray;
    }

    public static int[] combineArray2(int[] nums1, int[] nums2) {
        //create empty array with combine length of nums1 and nums2
        int[] combinedArray = new int[nums1.length + nums2.length];

        //use arraycopy method
        System.arraycopy(nums1,0,combinedArray,0,nums1.length);

        System.arraycopy(nums2,0,combinedArray,nums1.length,nums2.length);

        return combinedArray;
    }
    @Test
    void test1() {
        int[] array1 = new int[]{1, 3, 5, 6};
        int[] array2 = new int[]{7, 3, 6, 8, 9, 0};

        System.out.println(Arrays.toString(combineArray(array2, array1)));
    }
}
