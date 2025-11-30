package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueChar {

    @Test
    void test() {
        Assertions.assertEquals('C', firstUniqueChar("Coffee"));
        Assertions.assertEquals('h', firstUniqueChar("chocolate"));
        Assertions.assertEquals('0', firstUniqueChar("coco"));
    }

    public static char firstUniqueChar(String str) {

        char[] array = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char each : array) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }

        char result = '0';//placeholder value if there's no unique char
        for (char each : array) {
            if (map.get(each) == 1) {
                result = each;
                break;
            }
        }

        return result;
    }
}
