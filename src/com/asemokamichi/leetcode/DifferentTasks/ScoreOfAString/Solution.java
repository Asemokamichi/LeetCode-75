package com.asemokamichi.leetcode.DifferentTasks.ScoreOfAString;

class Solution {
    public static int scoreOfString(String s) {
        byte[] bytes = s.getBytes();
        int sum = 0;
        int start = bytes[0];
        for (byte b : bytes){
            sum += Math.abs(start - b);
            start = b;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
}