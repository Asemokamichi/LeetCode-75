package com.asemokamichi.leetcode.TwoPointers.MoveZeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        var index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                var tmp = nums[i];
                nums[i]=nums[index];
                nums[index] = tmp;
                index++;
            }
        }
    }
}