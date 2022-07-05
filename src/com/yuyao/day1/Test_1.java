package com.yuyao.day1;

public class Test_1 {

    int i = 0;
    public static void main(String[] args) {
        Test_1 t= new Test_1();
        System.out.println("i=" + t.i);
        t.incre();
        System.out.println("i=" + t.i);
    }

    public int incre() {
        return i++;
    }
}
