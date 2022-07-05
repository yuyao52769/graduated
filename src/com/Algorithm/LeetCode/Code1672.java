package com.Algorithm.LeetCode;

public class Code1672 {

    public int solution(int[][] accounts) {
        int maxCount = Integer.MIN_VALUE;
        int n = accounts.length;
        int m = accounts[0].length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += accounts[i][j];
            }
            maxCount = Math.max(maxCount, sum);
        }
        return maxCount;
    }
}
