package Stacks;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: "+st);
        // Stack<Integer> gt = new Stack<>(); //Helper stack
        // while(st.size() > 0){
        //     int x = st.peek();
        //     gt.push(x);
        //     st.pop();
        // }
        //  System.out.print(gt);
         //or
        Stack<Integer> gt = new Stack<>(); //Helper stack
        while(st.size() > 0){
            gt.push(st.pop());
            System.out.println("st is" + st);
            System.out.println("gt is" + gt);
        }
        System.out.println("Now st " + st);
        System.out.println("Now gt " + gt);
        System.out.println();
        
        Stack<Integer> copy = new Stack<>(); //Copied stack
        while(gt.size() > 0){
            copy.push(gt.pop());
        }
        while(copy.size() > 0){ //Moving the content of copy stack(copy) to original stack(st)
            st.push(copy.pop());
        }
        System.out.println("Stack in reversed order:"+st);
    }
 }
