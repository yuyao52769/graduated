package com.Algorithm.LeetCode;

public class Code557 {

    public String solution(String s) {
        String[] split = s.split(" ");
        for (String s1 : split) {
            reverse(s1);
        }
        s = split.toString();
        return s;
    }

    public void reverse(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            char temp = s.charAt(i);
           s =  s.replace(s.charAt(i), s.charAt(n - i -1));
           s = s.replace(s.charAt(n - i - 1), temp);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Code557 code557 = new Code557();
        String s = "Let's take LeetCode contest";
//        String s3 = "abcd";
//        System.out.println(s3.replace('a', 'f'));
//        String s4 = s3.replace('d', 'z');
//        System.out.println(s4);
//        System.out.println(s3);
//        System.out.println(s3);
//        code557.reverse(s3);
//        System.out.println(s3);
//        System.out.println(s);
        String solution = code557.solution(s);
        System.out.println(solution);
//        String s2 = "123456";
//        System.out.println(s2);
    }
}
