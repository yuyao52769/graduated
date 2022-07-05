package com.Algorithm.LeetCode;

public class Code62 {

    public int solution(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Code62 code62 = new Code62();
        int solution = code62.solution(3, 2);
        System.out.println(solution);
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int left = 0;
        for (int right = 1; right < nums.length; right++)
            if (nums[left] != nums[right])
                nums[++left] = nums[right];
        return ++left;
    }
}
