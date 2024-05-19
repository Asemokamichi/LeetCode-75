package com.asemokamichi.leetcode.TwoPointers.ContainerWithMostWater;

import java.util.Map;

// Пыталась улучшить и сократить прежний алгоритм, в итоге новый алгоритм хоть и работает, но
// все равно обрабатывает тяжелее. Надо бы подумать как можно улучшить
class Solution {
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                int min = Math.min(height[i], height[j]);
                max = Math.max(max, min * (j - i));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{2, 3, 4, 5, 18, 17, 6};
        System.out.println(maxArea(height));
    }
}