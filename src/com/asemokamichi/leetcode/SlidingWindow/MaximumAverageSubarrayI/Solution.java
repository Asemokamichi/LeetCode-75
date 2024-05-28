package com.asemokamichi.leetcode.SlidingWindow.MaximumAverageSubarrayI;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        var target = nums[0];
        double maxSum = 0;
        for (int i = 0; i < k; i++) maxSum += nums[i];
        double sum = maxSum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - target + nums[i];
            if (sum > maxSum) maxSum = sum;
            target = nums[i - k + 1];
        }

        return maxSum / k;
    }
}