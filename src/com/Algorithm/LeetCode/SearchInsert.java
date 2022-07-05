package com.Algorithm.LeetCode;

import java.lang.invoke.MutableCallSite;

public class SearchInsert {

    public int solution(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return nums[left] < target ? left + 1 : left;
    }
}
