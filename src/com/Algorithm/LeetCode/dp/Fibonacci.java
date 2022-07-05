package com.Algorithm.LeetCode.dp;

import java.security.Principal;
import java.util.Arrays;

public class Fibonacci {

    public int solution(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 0;
        if ( n == 0) {
            return t0;
        } else if (n == 1) {
            return t1;
        }
        for (int i = 2; i <= n; i++) {
            t2 = t0 + t1;
            t0 = t1;
            t1 = t2;
        }
        return t2;
    }

    public int[] solution2(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 45;
        int reslut1 = fibonacci.solution(n);
        System.out.println(reslut1);
        int[] result2 = fibonacci.solution2(n);
        System.out.println(Arrays.toString(result2));
    }
}
