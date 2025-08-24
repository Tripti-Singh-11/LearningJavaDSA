package Stacks;
import java.util.Stack;
public class DisplayStack {
    public static void printStack(Stack<Integer> st){ 
        Stack<Integer> helper = new Stack<>();
        while(st.size() > 0){
            helper.push(st.pop());
        }
        System.out.println( "helper :" + helper+" ");
        System.out.print("x : ");
        while(helper.size()>0){
            int x = helper.pop();
            st.push(x);
         System.out.print( x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        printStack(st);
        System.out.println("Stack is: "+st);
    }
}


