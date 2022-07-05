package com.Algorithm.DynamicPlanning;

public class Bag {

    public static int solute(int items, int maxWeight, int[] weights, int[] values) {
        int[][] dp = new int[items+1][maxWeight+1];
        for (int i = 1; i <= items; i ++) {
            int weight = weights[i-1];
            int value = values[i-1];
            for (int j = 1; j <= maxWeight; j ++) {
                if (weight > j) {
                    dp[i][j] = dp[i-1][j];
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight] + value);
            }
        }
        return dp[items][maxWeight];
    }
}
