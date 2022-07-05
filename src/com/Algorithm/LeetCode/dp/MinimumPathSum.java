package com.Algorithm.LeetCode.dp;

/**
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，
 * 使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 */

public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] paths = new int[m][n];
        if (m == 1 & n == 1) {
            return grid[0][0];
        }
        paths[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            paths[0][i] = paths[0][i-1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            paths[i][0] = paths[i-1][0] + grid[i][0];
         }

        if (m == 1) {return paths[0][n-1];}
        if (n == 1) {return paths[m-1][0];}

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = Math.min(paths[i-1][j] + grid[i][j], paths[i][j-1] + grid[i][j]);
            }
        }
        return paths[m-1][n-1];
    }
}
