package com.asemokamichi.leetcode.ArrayOrString.ReverseVowelsOfAString;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isInVowelsString(s.charAt(i))){
                arr.add(s.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0, j = arr.size()-1; i < s.length(); i++) {
            if (isInVowelsString(s.charAt(i))){
                str.append(arr.get(j--));
            }else str.append(s.charAt(i));
        }

        return str.toString();
    }

    private boolean isInVowelsString(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}