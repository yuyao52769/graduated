package com.Algorithm.LeetCode;

import java.util.List;
import java.util.Stack;

public class Code206 {

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = head;
        while (res != null) {
            stack.add(res);
            res = res.next;
        }
        ListNode newList = stack.pop();
        while (stack.peek() != null) {
            newList.next = stack.pop();
        }
        return newList;
    }
}



class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
