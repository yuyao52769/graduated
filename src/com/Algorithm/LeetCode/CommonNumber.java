package com.Algorithm.LeetCode;

import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.HashSet;

public class CommonNumber {

    public boolean solution(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result == 0;
    }

    public boolean solution3(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i])) {
                hashSet.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean solution2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
