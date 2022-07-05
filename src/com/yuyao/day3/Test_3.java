package com.yuyao.day3;

public class Test_3 {

    public static void main(String[] args) {
        int count = 0;
        for (int i =1; i <=100; i++) {
            if ((2*i - 1) % 7 == 0) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
