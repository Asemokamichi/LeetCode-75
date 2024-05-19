package com.asemokamichi.leetcode.TwoPointers.IsSubsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()>t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            var flag = false;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i)==t.charAt(j)){
                    t = t.substring(j+1);
                    flag = true;
                    break;
                }
            }
            if (!flag) return false;
        }

        return true;
    }
}