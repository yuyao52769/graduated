package com.DataStructure.SparseArraysAndQueues;


import java.util.Scanner;

public class Test {



    public void test1(){
        System.out.println("hello world");
    }


    public void testArrayQueue(){
        ArrayQueue queue = new ArrayQueue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
//        queue.list();
        try {
            queue.get();
            queue.get();
            queue.get();
            queue.get();
            queue.get();
            queue.get();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(5);
        Scanner scanner = new Scanner(System.in);
        char key = ' ';
        boolean quit = false;
        while (!quit) {
            System.out.println("s(show)：显示队列");
            System.out.println("a(add)：往队列添加整数");
            System.out.println("g(get)：移除队列头部数据");
            System.out.println("p(peek)：显示队列头部数据");
            System.out.println("q(quit)：退出程序!!!");
            key = scanner.next().charAt(0);
            try {
                switch (key)
                {
                    case 's':
                        queue.list();
                        break;
                    case 'a':
                        System.out.println("请输入整数!!!");
                        int a = scanner.nextInt();
                        queue.add(a);
                        break;
                    case 'g':
                        queue.get();
                        break;
                    case 'p':
                        System.out.println(queue.peek());
                        break;
                    case 'q':
                        quit = true;
                        break;
                }
            } catch (RuntimeException e) {
                quit = true;
                System.out.println(e);
            }

        }
        System.out.println("程序退出啦!!!");
    }
}
