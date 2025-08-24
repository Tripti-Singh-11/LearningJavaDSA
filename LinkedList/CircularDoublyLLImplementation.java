package LinkedList;
class DoublyCircularNode {
    int val;
    DoublyCircularNode next;
    DoublyCircularNode prev;
    DoublyCircularNode(int val) {
        this.val = val;
    }
}
class CircularDoublyLinkedList {
    private DoublyCircularNode head;
    private DoublyCircularNode tail;
    private int size;
    // Insert at Head
    public void insertAtHead(int val) {
        DoublyCircularNode node = new DoublyCircularNode(val);
        if (head == null) {
            head = tail = node;
            node.next = node.prev = node;
        } else {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }
        ++size;
    }
    // Insert at Tail
    public void insertAtTail(int val) {
        DoublyCircularNode node = new DoublyCircularNode(val);
        if (tail == null) {
            head = tail = node;
            node.next = node.prev = node;
        } else {
            node.prev = tail;
            node.next = head;
            tail.next = node;
            head.prev = node;
            tail = node;
        }
        ++size;
    }
    // Insert at Index
    public void insertAtIndex(int index, int val) throws Error {
        if (index < 0 || index > size)
            throw new Error("Invalid Index");
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        if (index == size) {
            insertAtTail(val);
            return;
        }
        DoublyCircularNode node = new DoublyCircularNode(val);
        DoublyCircularNode temp = head;
        for (int i = 0; i < index - 1; i++)
            temp = temp.next;
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
            ++size;
    }
    // Delete at Head
    public void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("List is empty");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        --size;
    }
    // Delete at Tail
    public void deleteAtTail() throws Error {
        if (tail == null)
            throw new Error("List is empty");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        --size;
    }
    // Delete at Index
    public void deleteAtIndex(int index) throws Error {
        if (index < 0 || index >= size)
            throw new Error("Invalid Index");
        if (index == 0) {
            deleteAtHead();
            return;
        }
        if (index == size - 1) {
            deleteAtTail();
            return;
        }
        DoublyCircularNode temp = head;
        for (int i = 0; i < index - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        temp.next.prev = temp;
        --size;
    }
     // Get value at index
    public int get(int index) throws Error {
        if (index < 0 || index >= size)
            throw new Error("Invalid Index");

        DoublyCircularNode temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp.val;
    }
    // Set value at index
    public void set(int index, int val) throws Error {
        if (index < 0 || index >= size)
            throw new Error("Invalid Index");

        DoublyCircularNode temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        temp.val = val;
    }
    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        DoublyCircularNode temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    // Display backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        DoublyCircularNode temp = tail;
        do {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }
    public int size() {
        return size;
    }
}                               
    public class CircularDoublyLLImplementation {
    public static void main(String[] args) throws Error {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        cdll.insertAtTail(10);
        cdll.insertAtTail(20);
        cdll.insertAtHead(5);
        cdll.insertAtHead(1);
        cdll.insertAtIndex(2, 99);  // Insert 99 at index 2

        cdll.displayForward();   // Output: 1 5 99 10 20
        cdll.displayBackward();  // Output: 20 10 99 5 1

        cdll.deleteAtHead();
        cdll.deleteAtTail();
        cdll.deleteAtIndex(1);

        cdll.displayForward();   // Output: 5 10

        System.out.println("Value at index 1: " + cdll.get(1)); // 10
        cdll.set(1, 100);
        cdll.displayForward(); // Output: 5 100

        System.out.println("Size: " + cdll.size());
    }
}
 