package com.Algorithm.LeetCode;

import java.util.Stack;

public class CQueue {

    public Stack<Integer> queue;

    public CQueue() {
    }

    public void appendTail(int value) {
        queue.add(value);
    }

    public int deleteHead() {
        if (queue.size() == 0 || queue == null) {
            return -1;
        }
        return 0;
    }

}
