package com.project.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {

    @DisplayName("Group anagrams with for loop")
    @Test
    void groupAnagram() {
        String [] strs = {"act","pots","tops","cat","stop","hat"};

        List<String> results = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String result = strs[i] +"-";
            boolean isAnagram = false;
            for (int j = 1; j < strs.length; j++) {

                if(strs[i].length()==strs[j].length() && !strs[i].equals(strs[j])){
                    if(isAnagram(strs[i],strs[j])){
                        result += strs[j] + "+";
                        isAnagram = true;
                    }
                }

            }
            result += "-";
            results.add(result);
            System.out.println("result = " + result);
            System.out.println("results = " + results);

        }


    }

    public boolean isAnagram(String str1, String str2){
        String[] strArray = str1.split("");
        String[] strArray2 = str2.split("");

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