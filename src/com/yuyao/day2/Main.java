package com.yuyao.day2;

import java.util.Scanner;

public class Main {

    public static int[] function_1(char[] arr, int start) {
        for (int i = start; i < arr.length; i ++) {
            if (arr[i] == '0' && arr[i+1] == '0' && arr[i+2] == '1') {
                int[] info = new int[]{start, i-1, i-1-start};
                return info;
            }
        }
        return new int[]{start, arr.length-1, arr.length-start};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        char[] arr = numbers.toCharArray();
        int[] first = function_1(arr, 0);
        int maxSize = first[2];
        int start = 0;
        int end = first[1];
        int[] temp = new int[]{0, 0, 0};
        while (end < arr.length-1) {
            temp = function_1(arr, end);
            if (temp[2] >= maxSize) {
                maxSize = temp[2];
                end = temp[1]+1;
            }
            else{
                end = temp[1]+1;
            }
        }
        int i = temp[0];
        int j = temp[1];
        System.out.println(temp[2]);
        for (int k = i; k <= j; k ++) {
            System.out.print(arr[k]);
        }
    }
}
