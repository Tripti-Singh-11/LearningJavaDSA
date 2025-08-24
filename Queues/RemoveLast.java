package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class RemoveLast {
    public static void reverselast(Queue<Integer> q,int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=n; ++i){
               if(i<=n-k){
                q.add(q.remove());
            }
            else q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k =3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Queue is "+ q);
        reverselast(q,k);
        System.out.println("Reverse Last Queue "+ q);    
    }  
}
