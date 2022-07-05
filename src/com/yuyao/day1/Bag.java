package com.yuyao.day1;

import java.util.Scanner;

public class Bag {

    public static int solution(int items, int maxWeight, int[] weights, int[] values) {
        int[][] dp = new int[items+1][maxWeight+1];
        for (int i = 1; i <= items; i ++) {
            int weight = weights[i-1];
            int value = values[i-1];
            for (int j = 1; j <= maxWeight; j++) {
                if (weight > j) {
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight] + value);
            }
        }
        return dp[items][maxWeight];
    }

    public static void main(String[] args) {
//        int items = 4;
//        int maxWeight = 20;
//        int[] weights = {10, 5, 6, 9};
//        int[] values = {100, 200, 66, 72};
//        int result = Bag.solution(items, maxWeight, weights, values);
//        System.out.println(result);
        Scanner in = new Scanner(System.in);
        System.out.println("please input a int number!");
        int number = in.nextInt();
        System.out.print(number);
    }

}
