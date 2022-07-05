package com.DataStructure.LinkedList;

import org.junit.Test;

public class TestLinkedList {

    @Test
    public void test1(){
        MyLinkedList linkedList = new MyLinkedList();
        Node node01 = new Node(1, "小卜", "xiaobo");
        Node node02 = new Node(2, "美琪", "meiqi");
        Node node03 = new Node(5, "小翟", "mengyuan");
        Node node04 = new Node(5, "迪娜", "dins");
        Node node05 = new Node(5, "迪娜", "dins");
        linkedList.add(node01);
        linkedList.add(node02);
        linkedList.add(node03);
        linkedList.addByID(node04);
        linkedList.list();
        linkedList.update(node05);
        System.out.println("==============");
        linkedList.delete(7);
        linkedList.list();
    }
}
