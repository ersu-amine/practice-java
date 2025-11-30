package com.project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HasDuplicates {
    @Test
    void test() {
        Assertions.assertTrue(hasDuplicates(new Integer[]{2,3,4,5,6,7,2,3}));
        Assertions.assertFalse(hasDuplicates(new Integer[]{2,3,4,5,6,7}));
    }

    //if the size changes after the array is converted to set, contains duplicates
    public static boolean hasDuplicates(Integer[] array){
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        //true if has duplicates
        return !(set.size()==array.length);

    }

}
