package Queues;

/*
 * ============================================================================
 * MODULE: Data Structures - Queue
 * FILE: QueuesDemo.java
 * ============================================================================
 * 
 * DESCRIPTION:
 * Queue Data Structure (FIFO - First In First Out) implementations:
 * 1. Simple Queue using Fixed Array
 * 2. Circular Queue using Array
 */

public class QueuesDemo {

    /*
     * ------------------------------------------------------------------------
     * IMPLEMENTATION 1: Simple Queue using Array
     * ------------------------------------------------------------------------
     * Time Complexity:
     * - add(): O(1)
     * - remove(): O(N) due to left shifting of elements
     * - peek(): O(1)
     * Space Complexity: O(N)
     */
    static class ArrayQueue {
        static int arr[];
        static int size;
        static int rear = -1;

        ArrayQueue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    /*
     * ------------------------------------------------------------------------
     * IMPLEMENTATION 2: Circular Queue using Array
     * ------------------------------------------------------------------------
     * Time Complexity:
     * - add(): O(1)
     * - remove(): O(1) (No shifting required, front pointer wraps around using modulo)
     * - peek(): O(1)
     * Space Complexity: O(N)
     * 
     * ERRORS / CORRECTIONS IN ORIGINAL CODE:
     * In original code `int front = arr[front];`, variable shadow error occurred.
     * Renamed local variable to `int res = arr[front];` to avoid masking field name.
     * ------------------------------------------------------------------------
     */
    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Simple Array Queue ---");
        ArrayQueue q1 = new ArrayQueue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }

        System.out.println("\n--- 2. Circular Queue ---");
        CircularQueue q2 = new CircularQueue(5);
        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);
        q2.add(50);

        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}
