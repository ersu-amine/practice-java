package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int index = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(max);
            if (nums[i] == 1) {
                index++;
            } else {

                index = 0; // reset counter
            }
            if (index > max) {
                max = index; // keep track of max ones
            }
        }
        return max;
    }

    @Test
    void test1() {
        int[] array = new int[]{1, 1, 1, 2, 3, 1, 2, 1, 1, 5, 1, 1};

        Assertions.assertEquals(3, findMaxConsecutiveOnes(array));
    }

    @Test
    void test2() {
        int[] array = new int[]{1, 1, 0, 1, 1, 1};

        Assertions.assertEquals(3, findMaxConsecutiveOnes(array));
    }
}
