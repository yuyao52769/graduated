package com.Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public int[] solution(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (nums1.length > nums2.length) {
            return solution(nums2, nums1);
        }
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] temp = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                temp[index++] = num;
                count--;
            } if (count > 0) {
                map.put(num, count);
            } else {
                map.remove(num);
            }
        }
        return Arrays.copyOfRange(temp, 0, index);
    }
}
