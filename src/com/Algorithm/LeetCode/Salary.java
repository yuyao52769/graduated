package com.Algorithm.LeetCode;

public class Salary {

    public double solution(int[] salary) {
        if (salary.length == 1 || salary.length == 2) {
            return 0;
        }
        else {
            int count = salary[0];
            int low = salary[0];
            int high = salary[0];
            for (int i = 1; i < salary.length; i++) {
                count += salary[i];
                if (salary[i] < low) {
                    low = salary[i];
                }
                if (salary[i] > high) {
                    high = salary[i];
                }
            }
            double result = (count - low - high) / (salary.length - 2);
            return result;
        }
    }
}
