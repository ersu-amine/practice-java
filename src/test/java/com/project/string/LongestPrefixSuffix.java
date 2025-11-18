package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPrefixSuffix {
    @Test
    void test() {
        Assertions.assertEquals("abab",findLongest("ababcdabab"));

        Assertions.assertNotEquals("abab",findLongest("coffeeco"));

    }

    //Longest prefix and suffix in a string
    //“ababcdabab” -> “abab”

    public static String findLongest(String str) {
        String longestSubStr = "";

        for (int i = 0; i < str.length(); i++) {
            String prefix = str.substring(0, i);
            String suffix = str.substring(str.length() - i);

            if (prefix.equals(suffix)) {
                longestSubStr = prefix;
            }
        }
        return longestSubStr;
    }

}
