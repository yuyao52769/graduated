package com.Algorithm.LeetCode;

import java.util.HashMap;

public class LeetCode0ne {

    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = nums.length;
        for (int i = 0; i < m; i ++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.remove(nums[i]);
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        LeetCode0ne code0ne = new LeetCode0ne();
        int[] number = new int[]{3,2,3,2,2,2};
        boolean b = code0ne.divideArray(number);
        System.out.println(b);
    }
}
