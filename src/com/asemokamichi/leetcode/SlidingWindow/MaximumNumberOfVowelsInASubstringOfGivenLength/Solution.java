package com.asemokamichi.leetcode.SlidingWindow.MaximumNumberOfVowelsInASubstringOfGivenLength;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxVowels(String s, int k) {
        Map<Character, Object> set = new HashMap();
        set.put('a', new Object());
        set.put('o', new Object());
        set.put('e', new Object());
        set.put('i', new Object());
        set.put('u', new Object());
        var array = new int[s.length()];
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.containsKey(s.charAt(i))) array[ind++] = 1;
            else array[ind++] = 0;
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) maxSum += array[i];
        int sum = maxSum;

        for (int i = k; i < array.length; i++) {
            sum += array[i] - array[i-k];
            if (sum > maxSum) maxSum = sum;
        }

        return maxSum;
    }
}

