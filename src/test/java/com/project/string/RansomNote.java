package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

        char[] noteArray = ransomNote.toCharArray();
        char[] magazineCharArray = magazine.toCharArray();

        //sort to make the order same, so arrays match, or use Collection.containsAll, but requires non-primitive type
        Arrays.sort(noteArray);
        Arrays.sort(magazineCharArray);
        return Arrays.equals(noteArray,magazineCharArray);
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
}
