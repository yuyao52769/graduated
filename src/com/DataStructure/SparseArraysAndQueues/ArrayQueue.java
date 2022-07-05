package com.DataStructure.SparseArraysAndQueues;


public class ArrayQueue {

    private int maxSize;
    private int[] arr;
    private int font;
    private int rear;
    private boolean flat = true;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        font = rear = 0;
    }

    public boolean isFull(){
        return rear == maxSize - 1;
    }

    public boolean isEmpty(){
        return rear < font || flat;
    }

    public void add(int value){
        if (!isFull()) {
            if (rear == 0 && flat) {
                arr[rear] = value;
                flat = !flat;
            } else {
                arr[++rear] = value;
            }
        } else {
            throw new RuntimeException("队列已经满啦!!!!");
        }
    }

    public int get(){
        if (!isEmpty()){
           return arr[font++];
        } else {
           throw new RuntimeException("数组为空!!!!");
        }
    }

    public void list(){
        if (isEmpty()) {
            throw new RuntimeException("数组为空!!!!");
        }
        for (int i = font; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("数组为空!!!!");
        }
        return arr[font];
    }

}
