package com.asemokamichi.leetcode.ArrayOrString;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < word1.length() && i < word2.length(); i++) {
            s.append(word1.charAt(i)).append(word2.charAt(i));
        }

        return s.append(word1.length() > word2.length() ?
                word1.substring(word2.length()) :
                word2.substring(word1.length())
        ).toString();
    }
}