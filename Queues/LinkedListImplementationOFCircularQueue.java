package Queues;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class CircularQueueLinkedList {
    private Node frontNode;
    private Node rearNode;
    private int size;
    public void add(int val) {
        Node temp = new Node(val);
        if (frontNode == null) { // size == 0
            frontNode = rearNode = temp;
        } else {
            rearNode.next = temp;
            rearNode = temp;
        }
        size++;
        rearNode.next = frontNode; 
    }
    public int remove() throws Error {
        if (size == 0) {
            throw new Error("Queue is empty");
        }
        int x = frontNode.val;
        if (frontNode == rearNode) {
            frontNode = rearNode = null;
        } else {
            frontNode = frontNode.next;
            rearNode.next = frontNode;
        }
        size--;
        return x;
    }
    public int peek() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty");
        } else {
            return frontNode.val;
        }
    }
    public void display() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty");
        } else {
            Node temp = frontNode;
            System.out.print("Queue: ");
            System.out.print(temp.val + " ");
            temp = temp.next;
            while (temp != frontNode) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
public class LinkedListImplementationOFCircularQueue {
    public static void main(String[] args) throws Exception {
        CircularQueueLinkedList Cirque = new CircularQueueLinkedList();
        Cirque.add(10);
        Cirque.add(20);
        Cirque.add(30);
        Cirque.add(40);
        Cirque.display();
        System.out.println("The size of queue is: " + Cirque.size());
        System.out.println("The removed element is: " + Cirque.remove());
        Cirque.display();
        Cirque.add(50);
        Cirque.add(60);
        Cirque.display();
        System.out.println("The size of queue is: " + Cirque.size());
        System.out.println("The front-most element of queue is: " + Cirque.peek());
        System.out.println("The size of queue is: " + Cirque.size());
        System.out.println("Is queue empty? " + Cirque.isEmpty());
    }
}
