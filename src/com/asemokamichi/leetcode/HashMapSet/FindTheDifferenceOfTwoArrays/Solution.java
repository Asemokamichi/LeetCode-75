package com.asemokamichi.leetcode.HashMapSet.FindTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map1 = new HashMap<>();
        HashMap<Integer, Boolean> map2 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (var w : nums1){
            map1.put(w, true);
        }

        for (var w : nums2){
            map2.put(w, true);
        }

        for(var w : map2.keySet()){
            if (!map1.containsKey(w)) list1.add(w);
        }

        for(var w : map1.keySet()){
            if (!map2.containsKey(w)) list2.add(w);
        }

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(list2);
        arr.add(list1);

        return arr;
    }
}