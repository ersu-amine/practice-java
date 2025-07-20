package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveCharacter {
    /*
        How do you remove all occurrences of a given character from an input string in Java?
     */

    public static String removeCharacter(String word, String character){
        String result = "";

        result = word.replaceAll(character, "");
        return result;
    }

    @Test
    void test() {
        System.out.println(removeCharacter("coffee", "c"));
        Assertions.assertEquals("jv",removeCharacter("java","a"));
    }
}
