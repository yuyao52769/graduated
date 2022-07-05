package com.Algorithm.LeetCode;

public class NumberOfOne {

    public int solution(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

    public int solution2(int n) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if((n & (1 << i)) != 0 ) {
                count++;
            }
        }
        return count;
    }
}
