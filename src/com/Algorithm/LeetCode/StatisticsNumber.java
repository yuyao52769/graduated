package com.Algorithm.LeetCode;

import java.util.Arrays;

public class StatisticsNumber {

    public int[] solution(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = statistics(i);
        }
        return result;
    }

    public int statistics(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        StatisticsNumber statisticsNumber = new StatisticsNumber();
        int[] result = statisticsNumber.solution(5);
        System.out.println(Arrays.toString(result));
    }

}
