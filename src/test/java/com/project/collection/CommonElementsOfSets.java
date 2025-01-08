package com.project.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsOfSets {
        /*
        Create a method that will return the intersection of the given Set objects. The intersection is the shared elements between the Set objects
            parameter: Set<Integer> set1, Set<Integer> set2
            return: Set<Integer>

        Ex:
            input:
                 set1: [3, 4, 1, 7, 2, 6, 5]
                 set2: [6, 2, 5, 1, 8]
            output:
                 [1, 2, 5, 6]
     */

    public static Set<Integer> commonElements(Set<Integer> set1, Set<Integer> set2) {

        //new Set to store common elements from ech set
        Set<Integer> commonSet = new HashSet<>();

        //iterate over one of the sets and if there's a match add it to the commonSet
        for (Integer i : set1) {
            if(set2.contains(i)){
                commonSet.add(i);
            }
        }
        return commonSet;
    }

    @Test
    void test() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,4,6,8,10,12,14));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(9,3,5,6,8));

        System.out.println(commonElements(set1, set2));
    }


    @Test
    void test2() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,4,6,8,10,12,14));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,3,5,7));

        System.out.println(commonElements(set1, set2));
    }
}
