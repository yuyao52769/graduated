package com.Algorithm.LeetCode;

public class Code1572 {

    public int solution(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        if (n == 1) {
            return mat[0][0];
        }
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n-i-1];
        }
        return n%2 == 0? sum : sum - mat[n/2][n/2];
    }
}
