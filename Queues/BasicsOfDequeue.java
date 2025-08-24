package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class BasicsOfDequeue {
   public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();
    dq.addLast(10);
    dq.add(23);
    dq.add(45);
    dq.add(78);
    dq.addLast(56);
    System.out.println("The Deque is "+dq);
    System.out.println("Size of deque is "+dq.size());

    dq.addFirst(60);
    dq.addFirst(70);
    dq.addFirst(80);
    dq.addFirst(90);
    System.out.println("The Deque is "+dq);
    System.out.println("Size of deque is "+dq.size());

    dq.addLast(10);
    dq.add(23);
    System.out.println("The Deque is "+dq);
    System.out.println("Size of deque is "+dq.size());

    System.out.println("The front-most element is "+dq.getFirst());
    System.out.println("The rear-most element is "+dq.getLast());
    System.out.println("The Deque is "+dq);
    System.out.println("Size of deque is "+dq.size());
    System.out.println("Is deque empty?"+dq.isEmpty());
    } 
}
