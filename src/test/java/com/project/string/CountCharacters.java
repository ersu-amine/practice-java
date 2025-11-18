package com.project.string;

import org.junit.jupiter.api.Test;

public class CountCharacters {
    @Test
    void test() {
        countLettersDigitsSpaces("My f@ve num is 5");
    }

    public static void countLettersDigitsSpaces(String str){
        int letterCount = 0;
        int digitCount = 0;
        int spaceCount = 0;


        for(char each: str.toCharArray()){
            if(each==' '){
                spaceCount++;
            }else if (Character.isDigit(each)){
                digitCount++;
            }else if (Character.isLetter(each)){
                letterCount++;
            }
        }
        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);
    }
}
