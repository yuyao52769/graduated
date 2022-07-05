package com.Algorithm.LeetCode;

import sun.security.util.Length;

public class BugStocks {

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int[] dp = new int[prices.length];
        int max = 0;
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = (dp[i-1] < prices[i])? dp[i-1] : prices[i];
            max = (prices[i] - dp[i]) > max ? prices[i] - dp[i] : max;
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfix = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i]-minPrice > maxProfix){
                maxProfix = prices[i] - minPrice;
            }
        }
        return maxProfix;
    }

    public int maxProfit3(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = dp[i - 1] < prices[i] ? dp[i-1] : prices[i];
            max += Math.max(max, prices[i] - dp[i]);
        }
        return max;
    }

    public int so(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public int so2(int[] digits) {
        int n = digits.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += (int) Math.pow(digits[i], n-i-1);
        }
        return ++res;
    }

    public int[] so3(int[] digits) {
        int n = digits.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += (int) Math.pow(digits[i], n-i-1);
        }
        res++;
        int count = 0;
        int d = 0;
        while (res >= 10) {
            d = res / 10;
            res %= 10;
            count++;
        }
        return new int[1];
    }
}
