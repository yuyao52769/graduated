package com.Algorithm.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {

    public boolean solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        while ( n != 1 ) {
            n = number(n);
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
        return true;
    }

    public int number(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }
}
