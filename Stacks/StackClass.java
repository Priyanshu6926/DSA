package Stacks;

import java.util.ArrayList;
import java.util.Stack;

/*
 * ============================================================================
 * MODULE: Data Structures - Stack
 * FILE: StackClass.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Multiple approaches for implementing and manipulating a Stack (LIFO):
 * 1. Stack using Linked List
 * 2. Stack using ArrayList
 * 3. Stack using Java Collection Framework (JCF)
 * 4. Push element at bottom of stack using Recursion
 * 5. Reverse a stack using Recursion
 */

public class StackClass {

    /*
     * ------------------------------------------------------------------------
     * APPROACH 1: Stack Implementation using Custom Linked List
     * ------------------------------------------------------------------------
     * Time Complexity: push O(1), pop O(1), peek O(1)
     * Space Complexity: O(N)
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListStack {
        Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    /*
     * ------------------------------------------------------------------------
     * APPROACH 2: Stack Implementation using ArrayList
     * ------------------------------------------------------------------------
     * Time Complexity: push O(1), pop O(1), peek O(1)
     * Space Complexity: O(N)
     */
    static class ArrayListStack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    /*
     * ------------------------------------------------------------------------
     * RECURSIVE ALGORITHM 1: Push Element at Bottom of Stack
     * ------------------------------------------------------------------------
     * Task: Insert element at the bottom of the stack without using extra stack.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) call stack
     */
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    /*
     * ------------------------------------------------------------------------
     * RECURSIVE ALGORITHM 2: Reverse Stack using Recursion
     * ------------------------------------------------------------------------
     * Task: Reverse elements of stack in-place.
     * 
     * Time Complexity: O(N^2)
     * Space Complexity: O(N) call stack
     */
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Linked List Stack ---");
        LinkedListStack lls = new LinkedListStack();
        lls.push(1);
        lls.push(2);
        lls.push(3);
        while (!lls.isEmpty()) {
            System.out.println(lls.peek());
            lls.pop();
        }

        System.out.println("\n--- 2. ArrayList Stack ---");
        ArrayListStack als = new ArrayListStack();
        als.push(10);
        als.push(20);
        als.push(30);
        while (!als.isEmpty()) {
            System.out.println(als.peek());
            als.pop();
        }

        System.out.println("\n--- 3. JCF Stack + Reverse Stack ---");
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Stack before reversal: [1, 2, 3] (top is 3)");
        reverseStack(s);
        System.out.println("Stack after reversal (top to bottom):");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
