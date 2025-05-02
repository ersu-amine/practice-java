package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateNumber {
    /*
    Find the Duplicate Number
        Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
        return the duplicate number.
        Input: [1,3,4,2,2]
        Output: 2
     */

    public static int duplicateNumber(int[] numbers) {
        int num = 0;
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numberMap.containsKey(numbers[i])) {
                //return the first duplicated number
                num = numbers[i];
            } else {
                numberMap.put(numbers[i], 1);
            }
        }
        return num;//returns 0 when there's no duplicated number
    }

    @Test
    void test() {
        Assertions.assertEquals(3, duplicateNumber(new int[]{1, 2, 3, 3, 4}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(0, duplicateNumber(new int[]{1, 2, 3, 5, 4}));
    }
}
