package com.asemokamichi.leetcode.SlidingWindow.LongestSubarrayofAfterDeletinOneElement;

class Solution {
    public int longestSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        var count = 0;
        var target = 0;
        var max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;

            if (nums[i] == 0 || i == nums.length - 1) {
                max = Math.max(target + count, max);
                target = count;
                count = 0;
            }
        }

        if (max == nums.length) return max - 1;

        return max;
    }
}