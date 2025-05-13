package LinkedList;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class GetSetList {
    Node head;
    Node tail;
    int size;
    // Insert at tail (helper to build list)
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
    // Get element at index
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
    // Set element at index
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
public class GetSetOperation {
    public static void main(String[] args) {
        GetSetList list = new GetSetList();
        list.insertAtTail(100);
        list.insertAtTail(200);
        list.insertAtTail(300);
        list.insertAtTail(400);
        list.display();        
        list.printSize();
        // Get element at index 2
        int val = list.get(2);  
        System.out.println("Element at index 2: " + val);
        // Set element at index 1 to 250
        list.set(1, 250);
        list.display();       
        // Set last element to 450
        list.set(3, 450);
        list.display();        
   }
}
