package com.Algorithm.LeetCode;

import java.net.DatagramPacket;

public class Code0801 {

    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
     }

    public int solution2(int n) {
        int t1 = 1;
        int t2 = 2;
        int t3 = 4;
        int t4 = 0;
        if (n == 1) {return t1;}
        if (n == 2) {return t2;}
        if (n == 3) {return t3;}
        for (int i = 4; i <= n; i++) {
            t4 = (t1 + t2 + t3) ;
            t1 = t2 ;
            t2 = t3 ;
            t3 = t4 ;
        }
        return t4 % 1000000007;
    }

    public static void main(String[] args) {
        Code0801 code0801 = new Code0801();
        int i = code0801.solution2(61);
        System.out.println(i);
    }
}
