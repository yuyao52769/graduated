package com.Algorithm.LeetCode;

public class JumpProblem {

    public boolean solution(int[] nums) {
        int maxR = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxR < i) {
                return false;
            } else {
                maxR = Math.max(maxR, i + nums[i]);
            }
        }
        return true;
    }
}
