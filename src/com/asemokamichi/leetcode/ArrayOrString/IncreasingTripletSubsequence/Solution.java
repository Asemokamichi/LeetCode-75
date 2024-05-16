package com.asemokamichi.leetcode.ArrayOrString.IncreasingTripletSubsequence;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = nums[0];
        int max = Integer.MAX_VALUE;
        for (var w : nums) {
            if (w <= min) min = w;
            else if (w <= max) max = w;
            else return true;
        }

        return false;
    }
}