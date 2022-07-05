package com.Algorithm.LeetCode;

import java.util.Arrays;

public class SquareArray {

    public int[] solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] solution2(int[] nums) {
        if (nums.length == 1) {
            nums[0] = (int) Math.pow(nums[0], 2);
            return nums;
        }
        int pointStar = -1;
        int pointZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pointZero = i;
                break;
            }
        }
        pointStar = pointZero - 1;
        int[] temp = new int[nums.length];

        for (int i = 0; i < temp.length; i++) {
            if (pointStar >= 0 && Math.abs(nums[pointStar]) > nums[pointZero] ) {
                temp[i] = nums[pointZero];
                pointZero++;
            } else if (pointZero < temp.length &&  Math.abs(nums[pointStar]) <= nums[pointZero]  ){
                temp[i] = nums[pointStar];
                pointStar--;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (int) Math.pow(temp[i], 2);
        }

        return temp;
    }

    public int[] solution3(int[] nums) {
        if (nums.length == 1) {
            nums[0] = (int) Math.pow(nums[0], 2);
            return nums;
        }
        int pointStar = -1;
        int pointZero = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pointZero = i;
                break;
            }
        }
        if (pointZero == 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) Math.pow(nums[i], 2);
            }
            return nums;
        }
        int[] temp = new int[nums.length];
        if (pointZero == -1) {
            for (int i = 0; i < nums.length; i++) {
                temp[i] = (int) Math.pow(nums[nums.length-1-i], 2);
            }
            return temp;
        }
        pointStar = pointZero - 1;
        int index = 0;
        while (pointStar >= 0 && pointZero < temp.length) {
            if ( Math.abs(nums[pointStar]) > nums[pointZero] ){
                temp[index] = nums[pointZero];
                pointZero++;
            }
            else {
                temp[index] = nums[pointStar];
                pointStar--;
            }
            index++;
        }
        if (pointStar == -1) {
            for (; pointZero < temp.length; pointZero ++) {
                temp[pointZero] = nums[pointZero];
            }
        }
        if (pointZero == temp.length - 1) {
            for (; pointStar >= 0; pointStar --) {
                temp[index] = nums[pointStar];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (int) Math.pow(temp[i], 2);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        SquareArray squareArray = new SquareArray();
        int[] ints = squareArray.solution3(nums);
        System.out.println(Arrays.toString(ints));
    }
}
