package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateChar {
    @Test
    void test() {
        Assertions.assertEquals("abcd", removeDuplicateChars("aaabbbbcccddd"));
        Assertions.assertEquals("cofe",removeDuplicateChars("coffeeco"));
    }

    public static String removeDuplicateChars(String str){
        String [] array = str.split("");
        String result = "";

        for(String each: array){
            if(!result.contains(each)){
                result += each;
            }
        }
        return result;
    }
}
