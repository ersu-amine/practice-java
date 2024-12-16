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


    }
    public int[] frequentElements(Integer[] nums, int k){
        int[] elements = new int[k];
        List<Integer> list = Arrays.asList(nums);
        Collections.sort(list); //sort and remove duplicates?


        //to store unique numbers
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i : set) {
            map.put(i, Collections.frequency(list,i));
        }

        //TODO implement finding most frequent
        return elements;
    }
}
