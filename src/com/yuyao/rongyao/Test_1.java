package com.yuyao.rongyao;

import java.util.*;

public class Test_1 {


//    public static boolean isHave(StringBuilder old, char c) {
//        for () {
//
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pre = in.next();
        List<Character> lists = new ArrayList<>();
        for (int i = pre.length()-1; i >= 0; i --) {
            if (!lists.contains(pre.charAt(i))) {
                lists.add(pre.charAt(i));
            }
        }

        for (char c : lists) {
            System.out.print(c);
        }
//
    }
}
