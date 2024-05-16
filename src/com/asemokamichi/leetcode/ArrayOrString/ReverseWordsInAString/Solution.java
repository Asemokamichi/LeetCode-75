package com.asemokamichi.leetcode.ArrayOrString.ReverseWordsInAString;
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i)!=' ') str.insert(0, s.charAt(i));

            if((s.charAt(i)==' ' || i == 0) && !str.isEmpty()) {
                res.append(str).append(" ");
                str = new StringBuilder();
            }
        }

        return res.deleteCharAt(res.length()-1).toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        Solution start = new Solution();
        System.out.println(start.reverseWords(s));
    }
}