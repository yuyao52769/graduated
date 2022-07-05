package com.Algorithm.LeetCode;

import java.util.HashMap;

public class SumOfTwo {

    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(target-nums[i], 0) == 0) {
                map.put(nums[i], i+1);
            } else  {
                result[0] = i+1;
                result[1] = map.get(target-nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(1111);
    }
}
