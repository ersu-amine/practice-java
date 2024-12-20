package com.project.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m + n];
        int index = 0;
        //merge
        for (int i = 0; i < (m + n); i++) {
            if (i >= m) {
                num[i] = nums2[index];
                index++;
            } else {
                num[i] = nums1[i];
            }
        }

        //sort

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        //add to nums1
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = num[i];
        }
    }

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1,m,nums2, n);

        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
    }

    @Test
    void test2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        merge(nums1,m,nums2, n);

        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
    }

    @Test
    void test3() {

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        merge(nums1,m,nums2, n);

        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
    }
}
