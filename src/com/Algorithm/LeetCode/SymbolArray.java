package com.Algorithm.LeetCode;

public class SymbolArray {

    public int solution(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                count++;
            }
        }
        return count % 2 == 0? 1 : -1;
    }
}
