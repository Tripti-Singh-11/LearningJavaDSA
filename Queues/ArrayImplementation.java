package Queues;
public class ArrayImplementation {
    static class MyQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100]; 
        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
            arr[rear] = val;
            size++;
        }
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = arr[front];
            front++;
            size--;
            if (size == 0) {
                front = rear = -1;
            }
            return removed;
        }
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return;
            }
             for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.display(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(15);
        q.display(); 
        System.out.println("Peek: " + q.peek()); 
        q.remove(); 
        q.display();
    }
}
