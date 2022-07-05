package com.Algorithm.LeetCode;

public class Code152 {

    public int solution(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if (dp[0] * nums[1] > dp[0]) {
            if (nums[1] > dp[0]) {
                dp[1] = nums[1];
            } else {
                dp[1] = dp[0] * nums[1];
            }
        } else {
            dp[1] = dp[0];
        }
       return 0;
    }
}
