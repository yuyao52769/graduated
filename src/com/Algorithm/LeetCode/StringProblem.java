package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class StringProblem {

    public boolean solution(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        ArrayList<char[]> lists = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                char[] arr = new char[2];
                arr[0] = s1.charAt(i);
                arr[1] = s2.charAt(i);
                lists.add(arr);
                if (count > 2) {
                    return false;
                }
            }
        }
        if (count == 2) {
            char[] first = lists.get(0);
            char[] second = lists.get(1);
            return first[0] == second[1] && first[1] == second[0];

        }
        return false;
    }

    public static void main(String[] args) {
        StringProblem problem = new StringProblem();
        System.out.println(problem.solution("a", "a"));
    }
}
