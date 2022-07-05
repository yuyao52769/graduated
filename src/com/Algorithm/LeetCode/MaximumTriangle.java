package com.Algorithm.LeetCode;

import java.util.Arrays;

public class MaximumTriangle {

    public int solution2(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 2; i--) {
            if (nums[i-1] + nums[i-2] > nums[i]) {
                return nums[i-1] + nums[i-2] + nums[i];
            }
        }
        return 0;
    }

    public int solution(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (isFit(nums[i], nums[j], nums[k])) {
                        max = Math.max(max, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return max;
    }

    public boolean isFit(int a, int b, int c) {
        return (a+b>c) && (a+c>b) && (b+c>a);
    }
}
