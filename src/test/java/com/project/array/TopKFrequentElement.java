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
        int[] array = {1,2,2,2,3,3,2,6,6,5,5,5,5,2};
        int[] nums = {1,1,1,2,2,3};
        int[] nums2 = {1};

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("frequentElements(array, 3) = " + Arrays.toString(frequentElements(array, 3)));
        System.out.println("frequentElements(nums, 2) = " + Arrays.toString(frequentElements(nums, 2)));
        System.out.println("frequentElements(nums2, 1) = " + Arrays.toString(frequentElements(nums2, 1)));
    }

    public int[] frequentElements(int[] array, int k){
        //convert int[] to Integer[]
        Integer[] nums = new Integer[array.length];
        Arrays.setAll(nums, x -> array[x]);

        //array to be returned with most frequent k element(s)
        int[] elements = new int[k];

        //get map of numbers, frequency as the key and number itself as the value
        Map<Integer, Integer> map = getIntFrequencyMap(nums);

        List<Integer> frequency = new ArrayList<>(map.keySet());

        //iterate and add most frequent elements to array
        for (int i = 0; i < k ; i++) {
            elements[i] = map.get(frequency.get(frequency.size()-1-i));
        }

        return elements;
    }

    private static Map<Integer, Integer> getIntFrequencyMap(Integer[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));

        //used for getting frequency, Collections do not work with array
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));

        //tree map has natural order by the key, least frequent will be the first since it will start from 1

        Map<Integer,Integer> map = new TreeMap<>();

        for (Integer i : set) {
            //put frequency as key and number as the value
            map.put(Collections.frequency(list,i), i);
            }
        return map;
    }
}
