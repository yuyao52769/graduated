package com.Algorithm.LeetCode.dp;

public class SumOfArray {

    public int solution(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre, pre+nums[i]);
            max = Math.max(max, pre);
        }
        return max;
    }
}
