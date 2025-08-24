package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class ReverseFirstKElementOfQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> q, int k) {
        if (q == null || k <= 0 || k > q.size()) {
            System.out.println("Invalid value of k!");
            return q;  // return original queue 
        }
        Stack<Integer> st = new Stack<>();
        // Step 1: Push First k elements to stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        // Step 2: Push reverse element of stack in queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
         // Step 3: Rotate remaining (n-k) elements 
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(9);
        q.add(8);
        System.out.println("Original Queue: " + q);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        reverseQueue(q, k);
        System.out.println("Queue after reversing first " + k + " elements: " + q);
    }
}
