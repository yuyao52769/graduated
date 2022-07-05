package com.Algorithm.LeetCode;

import java.awt.event.FocusEvent;
import java.util.HashMap;

public class SumOfTwoNumber {

    public int[] solution(int[] nums, int target) {
        int[] ints = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if ( !map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                int index = map.get(target - nums[i]);
                ints[0] = i;
                ints[1] = index;
            }
        }
        return ints;
    }
}
