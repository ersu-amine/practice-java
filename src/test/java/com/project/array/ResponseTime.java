package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseTime {

    //You are given a list of API response times in milliseconds.
    //Write a function that returns the average response time, excluding failed requests (marked as -1).


    @Test
    void test() {
        long[] time = new long[]{232455, 224364, 6869565, 2432557544L, 9890787999L, 5446767};

        Assertions.assertEquals(2056019782, averageResponse(time));
        long[] time2 = new long[]{};//empty array
        Assertions.assertEquals(-1, averageResponse(time2));

    }

    public static long averageResponse(long[] array) {
        if (array.length < 1) {
            return -1;
        }

        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }
}
