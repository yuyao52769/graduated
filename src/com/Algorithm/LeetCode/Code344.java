package com.Algorithm.LeetCode;

public class Code344 {

    public void solution(char[] s) {
        int n = s.length;
        for (int i = 0; i < n/2; i++) {
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}
