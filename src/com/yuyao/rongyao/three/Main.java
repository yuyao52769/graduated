package com.yuyao.rongyao.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int[] arr = new int[totalNumber];
        int i = 0;
        for (i = 0; i < totalNumber; i ++) {
            arr[i] = in.nextInt();
        }
       for (int index = 0; index < arr.length; index ++) {
           System.out.println(isGet(arr[index]));
       }
    }

    public static String isGet(int i) {
        List<Integer> res = allPrim(i);
        for (int start = 0; start <= res.size(); start++) {
            int sum = 0;
            for (int j = start; j < res.size() - start; j ++) {
                sum += res.get(j);
                if (sum == i) {
                    return "yes";
                }
                if (sum > i) {
                    break;
                }
            }

        }
        return "no";
    }

    public static List<Integer> allPrim(int number) {
        List<Integer> prims = new ArrayList<>();
        int i = 0;
        for (i = 2; i <= number; i++) {
            if (isPri(i)) {
                prims.add(i);
            }
        }
        return prims;
    }

    public static boolean isPri(int i) {
        int max = i/2 + 1;
        for (int n = 2; n < max; n ++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }
}
