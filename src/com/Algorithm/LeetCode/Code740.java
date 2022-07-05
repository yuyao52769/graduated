package com.Algorithm.LeetCode;

public class Code740 {

    public int solution(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = max >= num ? max : num;
        }

        int[] newNum = new int[max+1];
        for (int num : nums) {
            newNum[num]++;
        }

        int[] dp = new int[max+1];
        dp[0] = 0;
        dp[1] = newNum[1] * 1;
        dp[2] = Math.max(dp[1], newNum[2] * 2);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + newNum[i] * i);
        }

        return dp[max];

    }

}
