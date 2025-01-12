package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxNumber {
    //find max number in an int array

    public static int findMax(int[] array){
        int max = array[0];
        //iterate and find max
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max= array[i];
            }
        }
        return max;
    }

    //use sort method
    public static int findMax2(int[] array){
        Arrays.sort(array);
        //return last element, biggest one
        return array[array.length-1];
    }

    @Test
    void test1() {
        int[] array = new int[] {3, 5, 1, 5, -1, 5};

        Assertions.assertEquals(5,findMax(array));
    }

    @Test
    void test2() {
        int[] array = new int[] {3, 5, 1, 7, -1, 5};

        Assertions.assertEquals(7,findMax2(array));
    }
}
