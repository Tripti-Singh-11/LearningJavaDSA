package Queues;
import java.util.LinkedList;
import java.util.Queue;
public class Basics {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
         System.out.println("Is queue empty?"+que.isEmpty());
        //Basic Operations on Queue
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println("The addition of element is "+que); 
        System.out.println("The deleted element is "+que.remove());
        System.out.println("The deleted element is "+que.poll());
        System.out.println("Size of que" + que);
        System.out.println("The front-most element is "+que.peek());
        System.out.println("The fornt-most element is "+que.element());
        System.out.println("Size of que" + que);
        System.out.println("Size of the stack is "+que.size());
        System.out.println("Is queue empty?"+que.isEmpty());
    }
}

