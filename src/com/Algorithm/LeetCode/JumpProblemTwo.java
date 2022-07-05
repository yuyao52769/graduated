package com.Algorithm.LeetCode;

import java.lang.invoke.MutableCallSite;

public class JumpProblemTwo {

    public int solution(int[] nums) {
        int n = nums.length;
        int maxPosition = 0;
        int count = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                count++;
            }
        }
        return count;
    }

    public int findLong(int[] nums, int star, int end) {
        int max = nums[star];
        int theMaxIndex = star;
        for (int i = star; i <= end; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                theMaxIndex = i;
            }
        }
        return theMaxIndex;
    }
}
