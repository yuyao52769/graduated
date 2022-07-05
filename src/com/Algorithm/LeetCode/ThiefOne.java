package com.Algorithm.LeetCode;

public class ThiefOne {

    public int solution(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (nums.length == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[0], nums[1]);
        if (nums.length == 2) {
            return dp[1];
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i-1]);
        }
        return dp[nums.length-1];
    }

    public int solution2(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

        }
        return sum;

    }

    public static void main(String[] args) {
        ThiefOne one = new ThiefOne();
        int[] temp = {0};
        int solution = one.solution(temp);
        System.out.println(solution);
    }
}
