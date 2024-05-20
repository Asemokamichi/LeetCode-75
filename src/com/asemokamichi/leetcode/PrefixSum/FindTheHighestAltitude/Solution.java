package com.asemokamichi.leetcode.PrefixSum.FindTheHighestAltitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for (var w: gain){
            sum += w;
            max = Math.max(max, sum);
        }

        return max;
    }
}