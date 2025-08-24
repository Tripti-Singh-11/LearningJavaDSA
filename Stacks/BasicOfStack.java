package Stacks;
import java.util.Stack;
public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); 
        System.out.println(st.isEmpty());
        // 1. push 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st); 
         // 2. pop 
        st.pop();
        System.out.println(st);
        // 3. peek
        System.out.println(st.peek());
        System.out.println(st);
        //1. size() 
        System.out.println("Size of the stack is "+st.size());
        // 4. isEmpty() 
        System.out.println(st.isEmpty());
    }
}


