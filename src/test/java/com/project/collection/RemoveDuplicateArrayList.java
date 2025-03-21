package com.project.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RemoveDuplicateArrayList {
    /*
    You have an Array List. You have to find only unique values from this list. How would you find it?

     */

    //values with duplicate are removed, only values with frequency of 1 remains
    @DisplayName("Keep only unique values")
    @Test
    void removeDuplicates() {
        Integer [] array1 = new Integer[]{1,2,3,4,3,2,3,5,6,7,1};
        String [] array2 = new String[]{"apple", "cherry","peach", "nectarine","persimmon","apple", "cherry"};
        List<Integer> numArray = new ArrayList<>(Arrays.asList(array1));
        List<String> strArray = new ArrayList<>(Arrays.asList(array2));
        removeDuplicates(strArray);
        removeDuplicates(numArray);
        System.out.println("strArray = " + strArray);
        System.out.println("numArray = " + numArray);

    }

    @DisplayName("Keep 1 copy of each unique value")
    @Test
    void test2() {
        Integer [] array1 = new Integer[]{1,2,3,4,3,2,3,5,6,7,1};
        String [] array2 = new String[]{"apple", "cherry","peach", "nectarine","persimmon","apple", "cherry"};
        List<Integer> numArray = new ArrayList<>(Arrays.asList(array1));
        List<String> strArray = new ArrayList<>(Arrays.asList(array2));
        getUniqueValues(strArray);
        getUniqueValues(numArray);
        System.out.println("strArray = " + strArray);
        System.out.println("numArray = " + numArray);
    }

    /**
     * remove element with frequency more than 1
     * @param list list containing Object type values
     */
    public <T> void removeDuplicates(List<T> list){
        list.removeIf(p-> (Collections.frequency(list,p) >1));
    }

    /**
     *
     * @param list contains values with some duplicate elements
     * @param <T> generic type
     */
    public <T> void getUniqueValues(List<T> list){
        //set contains one copy of each value, duplicates removed
        Set<T> unique = new HashSet<>(list);
        list.clear();
        list.addAll(unique);

    }

}
