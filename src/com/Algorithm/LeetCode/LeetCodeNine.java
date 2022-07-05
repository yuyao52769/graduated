package com.Algorithm.LeetCode;

public class LeetCodeNine {

    public int solution(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
            multiply *= s.charAt(i) - '0';
        }
        return multiply - sum;
    }

    public static void main(String[] args) {
        LeetCodeNine codeNine = new LeetCodeNine();
        int solution = codeNine.solution(234);
        System.out.println(solution);
    }
}
