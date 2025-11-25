package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueString {
    /*
     Longest Unique Character Substring
     Write a method that returns the length of the longest substring with all unique characters.
        Example:
        Input → "pwwkew"
        Output → 3 (substring "wke")
     */

    @Test
    void test() {
        String str = "pwwkew";
        String str2 = "java";
        Assertions.assertEquals(3,uniqueSubstring(str));
        Assertions.assertEquals(3,uniqueSubstring(str2));
    }

    public static int uniqueSubstring(String str){
        int len = 0;
        for(int i=0; i < str.length(); i++){
            if(isUnique(str.substring(i))){
                len =str.substring(i).length();
                break;
            }
        }
        //check from creating substring from beginning
        for(int i=0; i < str.length(); i++){
            String substring = str.substring(0, str.length() - i);
            if(isUnique(substring)){
                int length = substring.length();
                if (len < length){
                    len = length;
                }
                break;
            }
        }
        return len;
    }

    public static boolean isUnique(String str){
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));

        //set has no duplicates, if same size, the string was unique
        return set.size()==str.length();
    }
}
