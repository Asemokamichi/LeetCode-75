package com.asemokamichi.leetcode.DifferentTasks.DivideTwoIntegers;

class Solution {
    public static int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;
        if (dividend==-2147483648 && divisor==-1){
            return 2147483647;
        }

        int isP = 1;
        if (dividend < 0) {
            isP *= -1;
            dividend = -dividend;
        }

        if (divisor < 0) {
            isP *= -1;
            divisor = -divisor;
        }

        int count = 0;
        while (dividend > divisor){
            dividend -= divisor;
            count++;
        }

        return count*isP;
    }

    public static void main(String[] args) {
        int dividend = -2147483648, divisor = -1;
        System.out.println(divide(dividend, divisor));
    }
}