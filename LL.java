public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last
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

    // Print List
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

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;
    }

    // Delete Last
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

    // Get Size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        LL list = new LL();

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

        System.out.println(list.getSize());

        list.addFirst("this");
        System.out.println(list.getSize());
    }
}