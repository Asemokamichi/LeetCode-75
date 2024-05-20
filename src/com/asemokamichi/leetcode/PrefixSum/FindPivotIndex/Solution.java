package com.asemokamichi.leetcode.PrefixSum.FindPivotIndex;

class Solution {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int currentSum = 0;
        for (int i : nums) sum += i;

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (currentSum == sum) return i;
            currentSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }
}
