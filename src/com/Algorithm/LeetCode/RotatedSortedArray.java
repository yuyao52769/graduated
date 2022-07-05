package com.Algorithm.LeetCode;

import sun.security.util.Length;

import java.util.Arrays;

public class RotatedSortedArray {

    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int length = nums.length;
        k = k % length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[(i+k)%length] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
        nums = Arrays.copyOf(result, length);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        RotatedSortedArray array = new RotatedSortedArray();
        int[] test = {1,2,3,4,5,6,7};
        array.rotate(test, 3);
    }
}
