package com.DataStructure.LinkedList;


import com.Algorithm.LeetCode.LeetCode0ne;

// 单向的链表
public class MyLinkedList {

    private Node head;

    public MyLinkedList(){
        head = new Node(0, "", "");
    }

    public void add(Node node) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addByID(Node node){
        int id = node.id;
        if (head.next == null) {
            head.next = node;
            return;
        }
        Node current = head;
        while (current.id < id) {
            if (current.next == null) {
                current.next = node;
                break;
            } else {
                if (current.next.id > id) {
                    Node temp = current.next;
                    current.next = node;
                    node.next = temp;
                    break;
                } else {
                    current = current.next;
                }
            }
            if (current.id == id) {
                System.out.println("该id已经存在，不能添加节点");
                break;
            }
        }


    }

    public void update(Node node) {
        if (head.next == null) {
            System.out.println("链表为空，不能修改!");
            return;
        }
        Node current = head;
        int id = node.id;
        while (current != null ) {
            if (current.id == id) {
                current.name = node.name;
                current.nickName = node.nickName;
                break;
            }
            current = current.next;
        }
        if (current.id != id) {
            System.out.println("链表中不存在该id节点!");
        }
    }

    public void delete(int id) {
        Node current = head;
        Boolean flat = false;
        while (true) {
            if (current.next == null) {
                break;
            }
            if (current.next.id == id) {
                flat = true;
                break;
            }
            current = current.next;
        }
        if (flat) {
            current.next = current.next.next;
        } else {
            System.out.println("无法删除该id节点!(不存在该节点信息)");
        }
    }

    public void list(){
        if (head.next == null) {
            System.out.println("链表为空!!!!");
            return;
        }
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }


}

class Node{
    int id;
    String name;
    String nickName;
    Node next;

    public Node(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    public Node(int id, String name, String nickName, Node next) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }


}