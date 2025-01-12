package com.project.array;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FrequencyOfElementsInWords {
    /*
            Given an array find the frequency of each element. The frequency is the number of times each element appears in the array. Output the frequency in a sentence using words to represent the number

        Constraints: a frequency can be any number from 1 to 10. If any frequency goes above 10 output: "more than 10" as the message

        Ex:
            input:
                frequencyElement(1,2,3,4,3,2,1,3,2,2,2,4)
            output:
                1 is two
                2 is five
                3 is three
                4 is two
     */

    public static void frequencyOfElements(int[] array) {

        List<Integer> list = new ArrayList<>();

        //add elements to list
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        //initialize set with values from the list
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        //iterate over set items, display
        for (Integer each : set) {
            String frequencyInWords = "";
            int frequency = Collections.frequency(list, each);
            switch (frequency) {

                case 1:
                    frequencyInWords = "one";
                    break;
                case 2:
                    frequencyInWords = "two";
                    break;
                case 3:
                    frequencyInWords = "three";
                    break;
                case 4:
                    frequencyInWords = "four";
                    break;
                case 5:
                    frequencyInWords = "five";
                    break;
                case 6:
                    frequencyInWords = "six";
                    break;
                case 7:
                    frequencyInWords = "seven";
                    break;
                case 8:
                    frequencyInWords = "eight";
                    break;
                case 9:
                    frequencyInWords = "nine";
                    break;
                case 10:
                    frequencyInWords = "ten";
                    break;
                default:
                    frequencyInWords = "more than 10";
                    break;
            }
            String result = each + " is " + frequencyInWords;
            System.out.println(result);

        }
    }

    @Test
    void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4};
        frequencyOfElements(nums);
    }


    @Test
    void test2() {
        int[] nums = new int[]{3,2,4,5,3,4,2,2,5,1,4,3,3};
        frequencyOfElements(nums);
    }
}
