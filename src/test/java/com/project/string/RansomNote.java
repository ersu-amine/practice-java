package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RansomNote {
    /*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.

    Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false
    Example 2:

    Input: ransomNote = "aa", magazine = "ab"
    Output: false
    Example 3:

    Input: ransomNote = "aa", magazine = "aab"
    Output: true
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        boolean result = false;

        List<String> noteList = new ArrayList<>(Arrays.asList(ransomNote.split("")));

        List<String> magazineList = new ArrayList<>(Arrays.asList(magazine.split("")));

        for (String character : noteList) {
            //remove matching characters
            magazineList.remove(character);
        }
        //check if magazine sized has been reduced exactly same size as the ransome note string size
        if(magazine.length() - magazineList.size() == ransomNote.length()){
            result = true;
        }

        return result;
    }

    @Test
    void test1() {
        Assertions.assertFalse(canConstruct("a","b"));
    }

    @Test
    void test2() {
        Assertions.assertFalse(canConstruct("aa","ab"));
    }

    @Test
    void test3() {
        Assertions.assertTrue(canConstruct("aa","aab"));
    }

    @Test
    void test4() {
        Assertions.assertTrue(canConstruct("baa","aab"));
    }

    @Test
    void test5() {
        Assertions.assertFalse(canConstruct("aa","ab"));
    }
}
