package com.yuyao.Day2022;

public class BinaryTreeSort {

    public Node root;

    public void add(Node node) {
        if (root == null) {
            this.root = node;
        } else {
            root.add(node);
        }
    }

    public void infixOrder(){
        if (root != null) {
            root.infixOrder();
        } else {
            System.out.println("This BinaryTree is not existed");
        }
    }

    public static void main(String[] args) {
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        for (int i : arr) {
            binaryTreeSort.add(new Node(i));
        }

        binaryTreeSort.infixOrder();
    }
}


class Node{
   public int value;
   public Node left;
   public Node right;

    @Override
    public String toString() {
        return "Node{" + "value=" + value + "}";
    }

    public Node(int value) {
        this.value = value;
    }

    public void add(Node node){
        if (node == null) {return;}
        if (node.value < this .value){
            if (this.left == null) {
                this.left = node;
            }else {
                this.left.add(node);
            }
        }
        else {
            if (this.right == null) {
                this.right = node;
            }else {
                this.right.add(node);
            }
        }
    }

    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right != null){
            this.right.infixOrder();
        }
    }
}
