package com.project.array;

import org.junit.jupiter.api.Test;

import java.util.*;

public class TopKFrequentElement {
    //https://leetcode.com/problems/top-k-frequent-elements/description/

    /*
    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

        Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
        Example 2:

        Input: nums = [1], k = 1
        Output: [1]

        Constraints:
        1 <= nums.length <= 105
        -104 <= nums[i] <= 104
        k is in the range [1, the number of unique elements in the array].
        It is guaranteed that the answer is unique.
     */
    @Test
    void test() {
        //TODO make int []
        Integer[] array = {1,2,2,2,3,3,2,6,6,5,5,5,5,2};
        frequentElements(array, 1);
    }

    public int[] frequentElements(Integer[] nums, int k){//uses Integer [] instead of int[]
        int[] elements = new int[k];
        //TODO make int[] into Integer[], to be used by Arrays class to make set
        //Integer [] intArray = nums;

        //used for getting frequency
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));

        //to store unique numbers
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        //tree map has natural order by the key, most frequent will be the first
        Map<Integer,Integer> map = new TreeMap<>();

        for (Integer i : set) {
            //put frequency as key and number as the value
            map.put(Collections.frequency(list,i), i);
            }

        System.out.println("map = " + map);
        System.out.println("map.keySet() = " + map.keySet());
        List<Integer> frequency = new ArrayList<>(map.keySet());

        int counter =0;

        for (int i = 0; i < k ; i++) {
            elements[i] = map.get(frequency.get(frequency.size()-1-i));
        }

        System.out.println("Arrays.toString(elements) = " + Arrays.toString(elements));
        return elements;
    }
}
