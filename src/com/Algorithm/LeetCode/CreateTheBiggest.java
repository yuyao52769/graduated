package com.Algorithm.LeetCode;

import java.util.Arrays;

public class CreateTheBiggest {

    public int solution(int n) {
        int[] nums = new int[n+1];
        if (n == 0) {
            return 0;
        }
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = i%2 == 0 ? nums[i/2] : nums[(i-1)/2] + nums[(i+1)/2];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
