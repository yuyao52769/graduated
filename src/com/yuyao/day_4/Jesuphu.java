package com.yuyao.day_4;

import java.nio.file.FileStore;

public class Jesuphu {

    public static void main(String[] args) {
        CircuNodeList list = new CircuNodeList(6);
        list.show();
        list.play(2, 2);
    }

}

class CircuNodeList {
    Node first =null;
    int index;

    public CircuNodeList(int maxNumber) {
        if (maxNumber < 1) {return;}
        clear();
        this.index = maxNumber;
        Node current = null;
        for (int i = 1; i <= maxNumber; i++) {
            Node node = new Node(i);
            if ( i == 1) {
                first = node;
                first.setNext(first);
                current = first;
            }
            current.setNext(node);
            node.setNext(first);
            current = node;
        }
    }

    public void play(int startIndex, int distance) {
        if (startIndex < 1 || distance > index) {return;}
        Node helper = first;
        while (true) {
            if (helper.getNext() == first) {break;}
//            first = first.getNext();
            helper = helper.getNext();
        }
        System.out.println("第一个标号是：" + first.getIndex());
        System.out.println("最后一个编号是" + helper.getIndex());
        for (int i = 0; i < startIndex - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        System.out.println("当前开始数数的编号是：" + first.getIndex());
        int count = 0;
        while (true) {
            if (helper == first) {break;}
            for (int j = 1; j <= distance; j++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            count ++;
            System.out.printf("第%d轮出圈的标号是%d \n", count, first.getIndex());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.println("最后留在群中的标号是：" + first.getIndex());



    }

    public void show() {
        if (first == null) {return;}
        Node node = first;
        while (true) {
            if (node.getNext() == first) {
                System.out.println("当前节点的编号是： " + node.getIndex());
                break;
            }
            System.out.println("当前节点的编号是： " + node.getIndex());
            node = node.getNext();
        }
    }

    public void clear() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

}

class Node {
    private int index;
    private Node next;

    public Node(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
