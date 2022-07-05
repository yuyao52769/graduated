package com.Algorithm.DivideAndConquer;

public class HanfTower {

    static int count = 0;

    public static void main(String[] args) {
        HanfTower.tower(10, 'a', 'b', 'c');
        System.out.println("一个执行了 " + count + " 次");
    }

    public static void tower(int n, char a, char b, char c) {
        count ++;
        if (n == 1) {
            System.out.println("第1个盘从 " + a + "-> " + c);
        } else {
            tower(n-1, a, c, b);
            System.out.println("第" + n + "个盘从 " + a + "-> " + c);
            tower(n-1, b, a, c);
        }

    }
}
