package com.Algorithm.LeetCode;

import com.sun.org.apache.bcel.internal.generic.RET;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

public class NumberOfOdds {

    public int solution(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public int solution2(int low, int high) {
        int count = 0;
        if (low % 2 == 1 || high % 2 == 1){
            return (high - low) / 2 + 1;
        } else {
            return (high - low) / 2;
        }

    }

    public static void main(String[] args) {
        NumberOfOdds numberOfOdds = new NumberOfOdds();
        int solution = numberOfOdds.solution(3, 99);
        System.out.println(solution);
        int solution2 = numberOfOdds.solution2(2, 100);
        System.out.println(solution2);
    }

}
