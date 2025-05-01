package com.project.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MergeSortedArray {


    /*
    Merge Two Sorted Lists
        Merge two sorted array and return it as a new sorted array.
        Input: l1 = [1,2,4], l2 = [1,3,4]
        Output: [1,1,2,3,4,4]
     */

    public static int[] mergeArray(int[] array1, int[] array2) {
        Logger LOG = LogManager.getLogger();

        //create new array to contain all elements
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }

        Arrays.sort(array3);
        LOG.info("merged array is: " + Arrays.toString(array3));
        return array3;
    }

    @Test
    void test1() {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        int[] expect = {1, 1, 2, 3, 4, 4};

        Assertions.assertArrayEquals(expect, mergeArray(arr1, arr2));

    }
}
