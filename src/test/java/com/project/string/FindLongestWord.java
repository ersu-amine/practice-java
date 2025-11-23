package com.project.string;

public class FindLongestWord {
    /*Find the Longest Word in a Sentence
    Example:
    Input → "Java programming is awesome"
    Output → "programming"
     */

    public static void main(String[] args) {
        String str = "My little coffee";
        String str2 = "I tried so hard and got so far";
        findLongestWord(str);
        findLongestWord(str2);
    }

    public static void findLongestWord(String str){
        String [] array = str.split(" ");
        int length = 0;
        int index=0;
        for(int i = 0; i<array.length; i++){
            if(array[i].length() > length){
                length = array[i].length();
                index = i;
            }
        }
        System.out.println(array[index]);
    }
}
