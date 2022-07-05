package com.yuyao.Day2022;

public class EightQueue {

    private int max = 8;
    private int[] array = new int[8];
    static int count = 0;

    public static void main(String[] args) {
        EightQueue queue = new EightQueue();
        queue.soluteQuestion(0);
        System.out.println("一共有" + count + "种方法");
    }

    public void soluteQuestion(int n) {
        if (n == max) {
            print();
            count++;
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (isFit(n)) {
                soluteQuestion(n+1);
            }
        }
    }

    public boolean isFit(int n) {
        for (int i = 0; i < n; i++) {
            if (array[n] == array[i] || Math.abs(array[n] - array[i]) == Math.abs(n - i)) {
                return false;
            }
        }
        return true;
    }

    public void print(){
        for (int i = 0; i < max; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
