package com.yuyao.day_4;

import javax.security.auth.login.AccountExpiredException;
import java.util.Arrays;

public class ShellSort {


    public static void shellSort(int[] arr) {
        int gap = arr.length;
        while (true) {
            gap = gap/2;
            if (gap == 0) {break;}
            for (int i = gap; i < arr.length; i ++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        swap(arr, j, j+gap);
                    }
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static int[] getRandomList(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i ++) {
            arr[i] = (int) (Math.random()*size);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] test = ShellSort.getRandomList(80000);
        long startTime = System.currentTimeMillis();
        ShellSort.shellSort(test);
        long endTime = System.currentTimeMillis();
        System.out.println("the running time is: " + (endTime-startTime) + "ms");
    }


}
