package com.project.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //make each string into String array
        String str = "team";
        String[] split = str.split("");
        String str2 = "meat";
        String[] split2 = str2.split("");

        String str3 = "meal";
        String[] split3 = str3.split("");

        //sort letters contained in Array
        Arrays.sort(split);
        Arrays.sort(split2);
        System.out.println("split = " + Arrays.toString(split));
        System.out.println("split1 = " + Arrays.toString(split2));

        //gives false
        //boolean isAnagram = split1.equals(split);

        //compare if letters in arrays are matching
        System.out.println("Arrays.equals(split1, split) = " + Arrays.equals(split2, split));
        System.out.println("Arrays.equals(split1, split) = " + Arrays.equals(split3, split));

    }
}
