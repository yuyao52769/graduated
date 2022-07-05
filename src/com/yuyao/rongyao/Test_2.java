package com.yuyao.rongyao;

import java.util.Scanner;

public class Test_2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] arr = input.split(" ");
        String last = arr[arr.length-1];
        System.out.println(last.length());
    }
}
