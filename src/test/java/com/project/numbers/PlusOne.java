package com.project.numbers;

import java.util.Arrays;
/*
You are given an integer array digits, where each digits[i] is the ith digit of a large integer. It is ordered from most significant to least significant digit, and it will not contain any leading zero.

Return the digits of the given integer after incrementing it by one.

Example 1:

Input: digits = [1,2,3,4]

Output: [1,2,3,5]
Explanation 1234 + 1 = 1235.

Example 2:

Input: digits = [9,9,9]

Output: [1,0,0,0]
 */
public class PlusOne {
    public static void main(String[] args) {

        int[] digits = new int[]{1, 2, 3, 4};
        int[] digits2 = new int[]{9,8,7,6,5,4,3,2,1,0};

        int[] integers = plusOne(digits2);

        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

        integers = plusOne(digits);

        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

    }

    public static int[] plusOne(int[] digits) {

        String digitsAsString = concatDigits(digits);

        long number = Long.parseLong(digitsAsString);

        number +=1;

        String[] digitsAsStringArray = String.valueOf(number).split("");
        int[] digitsPlusOne = new int [digitsAsStringArray.length];

        for (int i = 0; i < digitsAsStringArray.length; i++) {

            digitsPlusOne[i] = Integer.parseInt(digitsAsStringArray[i]);
        }

        return digitsPlusOne;

    }

    public static String concatDigits(int[] digits) {
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }
        return result.toString();
    }
}
