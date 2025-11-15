package com.project.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumber {
    @Test
    void test() {
        Assertions.assertEquals("Palindrome", isPalindrome(151));
        Assertions.assertEquals("Not Palindrome", isPalindrome(1192));
    }

    public static String isPalindrome(int num){
        int unReversed = num;
        int reversedNum=0;
        while(num!=0){
            reversedNum = reversedNum*10 + num%10;
            num = num/10;
        }
        return reversedNum == unReversed?"Palindrome":"Not Palindrome";
    }
}
