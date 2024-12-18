package com.project.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GroupAnagram {

    @Test
    void test() {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        String[] strse = {"hat"};

        groupAnagram(strs);

        groupAnagram(strse);
    }


    public static void groupAnagram(String[] strs) {
        //TODO implement 2D arrays
        Set<Set<String>> groups = new HashSet<>();

        for (int i = 0; i < strs.length; i++) {
            //set to store anagrams, inner set
            Set<String> results = new HashSet<>();

            for (int j = 0; j < strs.length; j++) {

                //anagrams have same length and not exactly same sequence
                if (strs[i].length() == strs[j].length() && !strs[i].equals(strs[j])) {
                    //add to inner set if anagram
                    if (isAnagram(strs[i], strs[j])) {
                        results.add(strs[j]);
                    }
                }
            }
            results.add(strs[i]);

            groups.add(results);
        }

        System.out.println("groups = " + groups);
    }

    public static boolean isAnagram(String str1, String str2) {
        String[] strArray = str1.split("");
        String[] strArray2 = str2.split("");

        //sorted arrays  should have same letters in same index
        Arrays.sort(strArray);
        Arrays.sort(strArray2);

        return Arrays.equals(strArray, strArray2);

    }
}
/*
Group Anagrams
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
Constraints:

1 <= strs.length <= 1000.
0 <= strs[i].length <= 100
strs[i] is made up of lowercase English letters.
 */