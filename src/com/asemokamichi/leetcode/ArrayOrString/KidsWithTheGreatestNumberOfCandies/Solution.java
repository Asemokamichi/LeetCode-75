package com.asemokamichi.leetcode.ArrayOrString.KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int w : candies) max = Math.max(w, max);

        List<Boolean> list = new ArrayList();
        for(int w : candies) list.add(w + extraCandies >= max);

        return list;
    }
}