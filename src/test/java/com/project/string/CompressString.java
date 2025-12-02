package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CompressString {
    @Test
    void test() {
        Assertions.assertEquals("c1e2f2o1",compressString("coffee"));
        Assertions.assertEquals("a3r1s1w1h1m1",compressString("shawarma"));
    }

    public static String compressString(String str){
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        Set<String> set = new HashSet<>(list);

        String result = "";

        for (String each : set){
            result += each+ (Collections.frequency(list,each));
        }
        return result;
    }
}
