package com.project.array;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FrequencyOfElements {
    /*
    Return number of each element and their frequency
        input:
            {apple,banana,apple,pear,cherry,cherry,apple,tomato}
        output:
            apple : 3
            banana : 1
            pear : 1
            cherry : 2
            tomato : 1


     */

    public static void displayFrequency(String[] array){
        //convert array to list
        List<String> list = new ArrayList<>(Arrays.asList(array));
        //make a set containing 1 of each element
        Set<String> set = new HashSet<>(list);

        //iterate over the set and get the frequency of each and display
        for (String str : set) {
            System.out.println(str + " : " + Collections.frequency(list,str));
        }
    }

    @Test
    void test() {
        String [] array = new String [] {"pear", "apple", "apple", "nectarine", "peach","pear", "tomato"};

        displayFrequency(array);
    }
}
