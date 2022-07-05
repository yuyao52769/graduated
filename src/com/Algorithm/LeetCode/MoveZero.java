package com.Algorithm.LeetCode;

import java.util.Arrays;

public class MoveZero {

    public void solution(int[] nums) {
        if(nums.length == 1) {
            return;
        }
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - count; i++) {
            if (nums[i] == 0) {
                count++;
                for (int j = i; j < n - count; j++) {
                    nums[j] = nums[j+1];
                }
                nums[n - count] = 0;
            }
        }
    }

    public static void main(String[] args) {
        MoveZero moveZero = new MoveZero();
        int[] nums = {0,1,0};
        moveZero.solution(nums);
        System.out.println(Arrays.toString(nums));
    }
}
