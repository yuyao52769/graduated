package com.Algorithm.LeetCode;

public class Code1014 {

    public int solution(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Code1014 code1014 = new Code1014();
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int res = code1014.solution(nums);
        System.out.println(res);
    }
}
