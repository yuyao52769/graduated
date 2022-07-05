package com.yuyao.day_4;

import java.nio.channels.Pipe;

public class ArrayBinaryTree {

    private int[] arr;

    public ArrayBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void perSort() {
        perSort(0);
    }

    public void infixSort() {
        infixSort(0);
    }

    public void postSort() {
        postSort(0);
    }
    public void postSort(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("Error! This Array Is Empty!");
            return;
        }
        if ((index * 2 + 1) < arr.length) {
            postSort(index * 2 + 1);
        }
        if ((index * 2 + 2) < arr.length) {
            postSort(index * 2 + 2);
        }
        System.out.println(arr[index]);
    }

    public void infixSort(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("Error! This Array Is Empty!");
            return;
        }
        if ((index * 2 + 1) < arr.length) {
            infixSort(index * 2 + 1);
        }
        System.out.println(arr[index]);
        if ((index * 2 + 2) < arr.length) {
            infixSort(index * 2 + 2);
        }
    }


    public void perSort(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("Error! This Array Is Empty");
            return;
        }
        System.out.println(arr[index]);
        if ((index * 2 + 1) < arr.length ) {
            perSort((index * 2 + 1));
        }
        if ((index * 2 + 2) < arr.length) {
            perSort((index * 2 + 2));
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayTree = new ArrayBinaryTree(arr);
        arrayTree.perSort();
    }
}
