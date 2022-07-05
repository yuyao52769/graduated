package com.Algorithm.LeetCode;

public class LeetCodeThree {

    public int halveArray(int[] nums) {
        double sum = 0;
        double[] doubles = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            doubles[i] = (double) nums[i];
            sum += doubles[i];
        }
        double max = doubles[0];
        int maxIndex = 0;
        double increase = 0;
        int count = 0;
        while ( increase < (sum / 2) ) {
            for (int i = 0; i < doubles.length; i++) {
                if (doubles[i] > max) {
                    max = doubles[i];
                    maxIndex = i;
                }
            }
            doubles[maxIndex] =  max / 2;
            increase +=  max / 2;
            count++;
            max = max / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = 15;
        System.out.println((double) i / 2);
        System.out.println((double)15/2);
    }

}
