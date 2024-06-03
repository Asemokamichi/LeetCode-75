package com.asemokamichi.leetcode.DifferentTasks.AppendCharactersToStringToMakeSubsequence;

class Solution {
    public static int appendCharacters(String s, String t) {
        int index = 0;
        for (int i = 0; i < s.length() && index < t.length(); i++) {
            if (s.charAt(i) == t.charAt(index)) index++;
        }
        return t.length() - index;
    }

    public static void main(String[] args) {
        String s = "z", t = "abcde";
        System.out.println(appendCharacters(s, t));
    }
}