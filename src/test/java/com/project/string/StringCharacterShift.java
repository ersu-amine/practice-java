package com.project.string;

import org.junit.jupiter.api.Test;

public class StringCharacterShift {
    @Test
    void test() {
        System.out.println(characterShift("ABCD", 4));

        System.out.println(characterShift("ABCD", 7));


        System.out.println(characterShift("UVWX", 7));

    }

    public static String characterShift(String str, int n){
        String result = "";

        for(int i = 0; i < str.length(); i ++){
            char each = (char) (str.charAt(i) + n);

            if(!Character.isLetter(each)){
                break;
            }

            result +=each;
        }

        return result;
    }
}
