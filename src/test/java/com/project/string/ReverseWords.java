package com.project.string;

import org.junit.jupiter.api.Test;

public class ReverseWords {
    /*
    Task: Write a Program to Reverse the Words in a Sentence.

Requirements:

Create a method reverseWords(String sentence) that takes a sentence as input and returns a new sentence where the order of the words is reversed.
The words should remain intact (not reversed individually), but their order in the sentence should change.
Handle multiple spaces between words and ignore leading or trailing spaces.
     */

    @Test
    void test() {
        System.out.println("reverseWords(\"Java is fun\") = " + reverseWords("Java is fun"));

    }

    public String reverseWords(String sentence){
        //empty string to hold the reversed sentence
        String reversed ="";
        //make string array by splittin sentence from the spaces
        String[] words = sentence.split(" ");

        //loop over each word in array in reverse order and concatenate
        for (int i = words.length-1; i >=0 ; i--) {
            reversed += words[i] +" ";
        }
        //trim to remove leading and trailing spaces
        return reversed.trim();
    }
}
