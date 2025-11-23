package com.project.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class EvenNumbersInList {
    /* Find All Even Numbers in a List

        Example:
        Input → [1, 2, 3, 4, 5, 6]
        Output → [2, 4, 6]

     */
    @Test
    void test() {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,7,4,2,6,8,33,44,54));
        System.out.println(findEvenNumsInList(numbers));
        Assertions.assertEquals(Arrays.asList(10,4,2,6,8,44,54), findEvenNumsInList(numbers));
    }

    public static List<Integer> findEvenNumsInList(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenNumbers.add(list.get(i));
            }
        }
        return evenNumbers;
    }
}
