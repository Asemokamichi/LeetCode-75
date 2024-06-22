package com.asemokamichi.leetcode.HashMapSet.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (var w : arr){
            map.put(w, map.getOrDefault(w, 0)+1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size()==map.keySet().size();
    }
}