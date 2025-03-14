package com.project.numbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomNumbers {
    /*
    Generate random number in a given range and given array size
    Return int array containing random numbers
     */
    public static int[] generateRandomArray(int range, int arraySize) {
        int[] numbers = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(0, range);
        }
        return numbers;
    }

    @Test
    void test() {
        System.out.println(Arrays.toString(generateRandomArray(7, 3)));
    }
}
