package LinkedList;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;  
    }
}
public class DisplayRecursively {
    public static void displayRecursively(Node head) {
        if (head == null) return;
        System.out.println(head.val);
        displayRecursively(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        displayRecursively(a);
    }
}
