package com.project.string;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

public class ReverseWordsInBetween {
    //reverse lines of string provided by the user
    //display the result
    //number of lines provided by the user as the first input

    /*
        1) Get user input for:
                            number of inputs/sentences to be given
                            sentences to be reversed
        2) Reverse the given sentences

        Example:
            Input: 3
                    hello my name is Rose
                    I have lived in many countries
                    My favourite drink
            Output:
                    hello is name my Rose
                    I many in lived have countries
                    My favourite drink
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int number = Integer.parseInt(reader.nextLine());
        int counter = 0;
        String[] array = new String[number];

        while (counter < number) {
            String input = reader.nextLine();
            array[counter] = input;
            counter++;
        }


        for (int j = 0; j < number; j++) {
            String[] str = array[j].split(" ");
            System.out.print(str[0] + " ");
            if (str.length > 1) {
                //System.out.println("Arrays.toString(str) = " + Arrays.toString(str));

                for (int i = str.length - 2; i > 0; i--) {
                    System.out.print(str[i] + " ");
                }

                System.out.print(str[str.length - 1]);
            }
            System.out.println();
        }

    }
}

