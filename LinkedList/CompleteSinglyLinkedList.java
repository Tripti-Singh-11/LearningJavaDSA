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

    // Insert at tail
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

    // Insert at any index
    void insertAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        if (index == size) {
            insertAtTail(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
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
            Node temp = head;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
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
        if (index == size - 1) {
            deleteAtTail();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    // Get value at index
    int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
        if (index == size - 1) return tail.val;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Set value at index
    void set(int index, int newVal) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
        if (index == size - 1) {
            tail.val = newVal;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.val = newVal;
    }

    // Display the list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print current size of the list
    void printSize() {
        System.out.println("Size: " + size);
    }
}

public class CompleteSinglyLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.printSize();  
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();        
        list.printSize();       

        list.insertAtHead(5);
        list.insertAtHead(1);
        list.display();         
        list.printSize();      

        list.insertAtIndex(3, 15);  // Inserting 15 at index 3
        list.insertAtIndex(0, 100); // Insert at head
        list.insertAtIndex(list.size, 200); // Insert at tail
        list.display();         
        list.printSize();  

        list.deleteAtHead();    
        list.display();         
        list.deleteAtTail();    
        list.display();         
        list.deleteAtIndex(2);  
        list.display();       

        System.out.println("Element at index 2: " + list.get(2));
        list.set(1, 111);
        list.set(3, 333);
        list.display();        
    }
}
