package com.yuyao.test;

public class Son extends Father {

    public void method(){
        super.hello();
    }

//    @Override
    public void say() {
        System.out.println("son say......");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}
