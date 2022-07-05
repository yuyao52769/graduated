package com.Algorithm.LeetCode;

public class LeetCodeFive {

    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            int j = 0;
            int k = i + 1;
            while ( j < i && k < n) {
                if ((nums[j] < nums[i] && nums[k] < nums[i]) || (nums[j] > nums[i] && nums[k] > nums[i])) {
                    count++;
                    break;
                } else if (nums[j] > nums[i] && nums[k] < nums[i]){
                    k++;
                }
            }
        }
        return count;
    }

    public int countHillValley2(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            int j = 0;
            int[] temp = new int[n];
            for (; j < n; j++) {
                if (nums[j] < nums[i]) {
                    temp[j] = 0;
                } else if (nums[j] > nums[i]) {
                    temp[j] = 2;
                } else {
                    temp[j] = 1;
                }
            }
            

        }
        return 0;
    }
}
