package com.asemokamichi.leetcode.DifferentTasks.ZigzagConversion;

class Solution {
    /*
    * convert
    */
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        var num = Math.ceil(s.length() * 2.0 / (numRows * 2 - 2));
        char[][] array = new char[(int) num][numRows];
        for (int i = 0, q = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                for (int j = array[i].length - 2; j > 0 && q < s.length(); j--) {
                    array[i][j] = s.charAt(q++);
                }
            } else {
                for (int j = 0; j < array[i].length && q < s.length(); j++) {
                    array[i][j] = s.charAt(q++);
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] != 0) str.append(array[i][j]);
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(s, numRows));
    }
}