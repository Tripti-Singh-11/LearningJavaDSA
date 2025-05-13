package LinkedList;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class InsertIndex {
    Node head;
    Node tail;
    int size;
    void insertAtIndex(int idx, int val) {
        if (idx < 0 || idx > size) throw new IndexOutOfBoundsException("Invalid index!");
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        Node temp = new Node(val);
        Node curr = head;
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        size++;
    }
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class InsertAtIndex {
    public static void main(String[] args) {
        InsertIndex list = new InsertIndex();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtIndex(2, 15); // insert 15 at index 2
        list.display();  
    }
}

