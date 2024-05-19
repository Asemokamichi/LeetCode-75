package com.asemokamichi.leetcode.TwoPointers.MaxNumberOfKSumPairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxOperations(int[] nums, int k) {
        var count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (var w : nums){
            if (map.containsKey(k-w)){
                count++;
                if (map.get(k-w)==1) map.remove(k-w);
                else map.put(k-w,map.get(k-w)-1);
            }else map.put(w, map.getOrDefault(w, 0)+1);
        }

        return count;
    }
}