package LinkedList;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class SLL {
    Node head;
    Node tail;
    int size;
    // Insert at end
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // Insert at head
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
     // Print size
    void printSize() {
        System.out.println("Size: " + size);
    }
}
public class InsertAtEndAndHead {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.printSize();  
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.printSize();         
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.printSize();  
        list.display();      
        list.printSize();   
    }
}


