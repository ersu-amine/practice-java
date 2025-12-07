package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfTwo {
    /*
    Check if a Number is a Power of Two
        input : 8
        output : true
     */

    @Test
    void test() {
        Assertions.assertTrue(isPowerOfTwo(64));
        Assertions.assertFalse(isPowerOfTwo(3));
        Assertions.assertFalse(isPowerOfTwo(30));
    }

    public static boolean isPowerOfTwo(int number){
        int num = number;
        if (number<1 || number%2!=0){
            return false;
        }
        int power = 0;
        while (number%2==0){
            number /=2;
            power++;
        }

        if (number ==1){
            System.out.println(num + " is the " + power + "th power of two.");
        }
        return number == 1; //return true if
    }
}
