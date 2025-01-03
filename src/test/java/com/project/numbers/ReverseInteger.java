package com.project.numbers;

import org.junit.jupiter.api.Test;

public class ReverseInteger {
    //the number
    //123 --> 321


    @Test
    void reverseNumberUsingString() {
        //123, -123, 120
        //321, -321, 21

        int num = 123;
        int sign = 1;
        System.out.println(num);
        String reversed = "";
        //if number is negative, take absolute value
        if(num< 0){
            sign = -1;
            num = Math.abs(num);
        }
        String number = String.valueOf(num);
        for (int i = number.length()-1; i >=0 ; i--) {
            reversed += number.charAt(i);
        }

        System.out.println(reversed);
        
        int rev = Integer.parseInt(reversed) + sign;

        System.out.println("rev = " + rev);
    }

    @Test
    void reverseNumberUsingOperators() {

        int num = 123;
        System.out.println(num);
        int reverse = 0;
        while (num !=0){
            //move decimal point to the right by multiplying by 10
            reverse *=10;
            //new number put beside former number
            reverse += num % 10;
            //update num, move decimal to the left
            num = num / 10;
        }

        System.out.println(reverse);

    }
    
    
}
