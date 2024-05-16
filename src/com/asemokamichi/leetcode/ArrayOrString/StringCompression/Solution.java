package com.asemokamichi.leetcode.ArrayOrString.StringCompression;

class Solution {
    public int compress(char[] chars) {
        int count = 0;
        char target = chars[0];
        int ind = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==target) count++;
            else{
                chars[ind++] = target;
                if (count>1){
                    for( var w : Integer.toString(count).toCharArray()){
                        chars[ind++] = w;
                    }
                }
                target = chars[i];
                count = 1;
            }
        }

        chars[ind++] = target;
        if (count>1){
            for( var w : Integer.toString(count).toCharArray()){
                chars[ind++] = w;
            }
        }

        return ind;
    }
}