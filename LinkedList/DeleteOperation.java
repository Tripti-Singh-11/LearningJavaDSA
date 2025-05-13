package LinkedList;
  class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class DeleteList {
    Node head;
    Node tail;
    int size;
    // Insert at tail
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // Delete at head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }
    // Delete at tail
    void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node curr = head;
            while (curr.next != null && curr.next != tail) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }
        size--;
    }
    // Delete at index
    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr.next == tail) {
            tail = curr;
        }
        curr.next = curr.next.next;
        size--;
    }
    // Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Size
    void printSize() {
        System.out.println("Size: " + size);
    }
}
public class DeleteOperation {
    public static void main(String[] args) {
        DeleteList list = new DeleteList();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();         
        list.printSize();       
        list.deleteAtHead();    
        list.display();        
        list.deleteAtTail();   
        list.display();        
        list.deleteAtIndex(1);  
        list.display();        
        list.printSize();
    }
}

