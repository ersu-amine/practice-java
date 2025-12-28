package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassRate {
    /*
        You are given a list of test execution results where:

        1 = test passed

        0 = test failed

        Write a method that returns true if the pass rate is at least 80%, otherwise return false.

        Example
        Input:  [1, 1, 0, 1, 1]
        Output: true   // 4 out of 5 passed = 80%
     */

    @Test
    void test() {
        Assertions.assertTrue(calculatePassRate(new int[]{1,1,0,1,1}));

        Assertions.assertTrue(calculatePassRate(new int[]{1,1,1,1,1,0,1,1}));


        Assertions.assertFalse(calculatePassRate(new int[]{1,0,1,1,1,0,1,1}));
    }

    public static boolean calculatePassRate(int[] array){
        double passing = 0;
        int total = array.length;

        for(int each:array){
            if (each==1){
                passing++;
            }
        }
        return passing >= (total * 0.8);
    }
}
