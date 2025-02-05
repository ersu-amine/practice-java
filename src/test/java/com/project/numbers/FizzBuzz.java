package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FizzBuzz {
    /*
    Given an integer n, return a string array answer (1-indexed) where:

        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        answer[i] == "Fizz" if i is divisible by 3.
        answer[i] == "Buzz" if i is divisible by 5.
        answer[i] == i (as a string) if none of the above conditions are true.


        Example 1:

        Input: n = 3
        Output: ["1","2","Fizz"]
        Example 2:

        Input: n = 5
        Output: ["1","2","Fizz","4","Buzz"]
        Example 3:

        Input: n = 15
        Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     */

    public String [] fizzBuzz(int n){
        //make empty array to store numbers and words, Fizz, Buzz, or FizzBuzz
        String[] array = new String[n];

        int index = 0; //keep track of index

        //iterate through each number and check divisibility
        for (int i = 1; i <= n; i++) {
            String element ="";
            if (i%3==0 && i%5==0){
                //convert number to string
                element = "FizzBuzz";
            } else if (i%3==0){
                element = "Fizz";
            }else if (i%5==0){
                element = "Buzz";
            }else{
                //convert number to string
                element = String.valueOf(i);
            }

            array[index] = element;//add element to array
            index++; //update the index of the array
        }

        System.out.println(Arrays.toString(array));
        return array;
    }

    @Test
    void test1() {
        Assertions.assertArrayEquals(new String[]{"1","2","Fizz","4", "Buzz"}, fizzBuzz(5));
    }
}
