package com.yuyao.day1;

public class BagProblems {


    public static int solutionProblem(int N, int W, int[] weight, int[] values ) {
        int[][] dp = new int[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            int w = weight[i-1];
            int v = values[i-1];
            for(int j = 1; j <= W; j++) {
                if (w > j) {
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w] + v);
            }
        }
        return dp[N][W];
    }

//    public static boolean canPartition(int[]  nums) {
//
//    }

    public static void main(String[] args) {
        int[] weights = {5, 6, 10, 9};
        int[] values = {200, 66, 100, 72};
        int maxWeight = 20;
        int numberOfItem = 4;
        System.out.println(BagProblems.solutionProblem(numberOfItem, maxWeight, weights, values));
    }
}
