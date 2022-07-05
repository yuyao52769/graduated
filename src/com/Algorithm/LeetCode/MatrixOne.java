package com.Algorithm.LeetCode;

public class MatrixOne {

    public boolean solution(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flat = false;
        int last = 0;
        for (int i = 0; i< m; i ++) {
            for (int j = 0; j < n-1; j++) {
                if (matrix[i][j] > matrix[i][j+1]){
                    return false;
                }
                if (matrix[i][j] == target || matrix[i][j+1] == target) {
                    flat = true;
                }
            }
            if (i != 0) {
                if (matrix[i][0] < matrix[i-1][n-1]) {
                    return false;
                }
            }
        }
        return flat;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 0; i++) {
            System.out.println("hello");
            return;
        }
        for (int j = 0; j < 3; j++) {
            System.out.println(j);
        }
    }
}
