package LinkedList;

import java.util.LinkedList;

/*
 * ============================================================================
 * MODULE: Data Structures - Linked List
 * FILE: LinkedListDemo.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Complete implementation of a custom Singly Linked List data structure in Java 
 * alongside Java Collections Framework (JCF) LinkedList usage examples.
 */

public class LinkedListDemo {

    Node head;
    private int size;

    LinkedListDemo() {
        this.size = 0;
    }

    // Inner Node representation
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 1: Add Node at First Position
     * ------------------------------------------------------------------------
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 2: Add Node at Last Position
     * ------------------------------------------------------------------------
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 3: Print Linked List
     * ------------------------------------------------------------------------
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 4: Delete First Node
     * ------------------------------------------------------------------------
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 5: Delete Last Node
     * ------------------------------------------------------------------------
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 6: Get Size of Linked List
     * ------------------------------------------------------------------------
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int getSize() {
        return size;
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 7: Reverse Linked List (Iterative Approach)
     * ------------------------------------------------------------------------
     * Logic: Use 3 pointers (prevNode, currNode, nextNode) to reverse pointers.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update pointers
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    /*
     * ------------------------------------------------------------------------
     * OPERATION 8: Reverse Linked List (Recursive Approach)
     * ------------------------------------------------------------------------
     * Logic: Base case (head == null or head.next == null). Recursively reverse 
     * sub-list and point head.next.next to head.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N) auxiliary call stack space
     */
    public Node reverseRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /*
     * ------------------------------------------------------------------------
     * JAVA COLLECTION FRAMEWORK (JCF) LINKEDLIST EXAMPLE
     * ------------------------------------------------------------------------
     */
    public static void jcfLinkedListExample() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println("JCF List: " + list);

        System.out.println("Element at 0: " + list.get(0));
        System.out.println("Size: " + list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println("After Removals: " + list);
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();

        list.addFirst("a");
        list.addFirst("b");
        list.printList();

        list.addLast("c");
        list.printList();

        list.addFirst("d");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head = list.reverseRecursion(list.head);
        list.printList();

        System.out.println("Size: " + list.getSize());

        list.addFirst("this");
        System.out.println("Updated Size: " + list.getSize());

        System.out.println("\n--- Java Collection Framework Demo ---");
        jcfLinkedListExample();
    }
}
