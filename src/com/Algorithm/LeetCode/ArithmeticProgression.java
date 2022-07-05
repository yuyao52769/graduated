package com.Algorithm.LeetCode;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class ArithmeticProgression {

    public boolean solution(int[] arr) {
        if (arr.length == 3) {
            return (arr[0] + arr[2] == 2 * arr[1]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-3; i++) {
            if ((arr[i] - arr[i+1]) != (arr[i+1] - arr[i+2])){
                return false;
            }
        }
        return true;
    }
}
