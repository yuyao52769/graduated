package com.yuyao.tree;

import sun.awt.geom.AreaOp;

import java.util.*;

public class HuffmanTree {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 7, 8, 3, 29, 6, 1};
        Node root = creatHuffmanTree(arr);
        root.preOrder();
    }

    public static Node creatHuffmanTree(int[] arr) {
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            Node left = nodes.get(0);
            Node right = nodes.get(1);
            Node parent = new Node(left.value + right.value, left, right, '\u0000');
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }


}

class Node implements Comparable<Node> {

    char c;
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this(value, null, null, '\u0000');
    }

    public Node(int value, Node left, Node right, char c) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.c = c;
    }


    public void preOrder() {
        if (this == null) {
            return;
        }
        System.out.print(this.value + " ");
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    @Override
    public String toString() {
        return "Node[value=" + value + "]";
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
