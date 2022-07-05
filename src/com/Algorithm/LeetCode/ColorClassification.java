package com.Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class ColorClassification {

    public void solution(int[] nums) {
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if ( !map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                Integer value = map.get(nums[i]);
                map.put(nums[i], value+1);
            }
        }
        int numberOf0 = map.get(0);
        int numberOf1 = map.get(1);
        int numberOf2 = map.get(2);
        int[] result = new int[size];
        for (int i = 0; i < numberOf0; i++) {
            result[i] = 0;
        }
        for (int j = numberOf0; j < numberOf0 + numberOf1; j++) {
            result[j] = 1;
        }
        for (int k = numberOf0+ numberOf1; k < numberOf0+numberOf1+numberOf2; k++){
            result[k] = 2;
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        ColorClassification colorClassification = new ColorClassification();
        int[] number ={0,1,1,0};
        colorClassification.solution(number);
    }
}
