package Stacks;
import java.util.Stack;
public class PushElementAtBottom {
      public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: "+st);
        Stack<Integer> gt = new Stack<>(); // temp stack (copy of original stack in reverse order)
        while(st.size() > 0){
            gt.push(st.pop());
        }
        st.push(5); //pushing the element at the bottom of the stack
        while(gt.size() > 0){ // coping the temp stack back to original stack
            st.push(gt.pop());
        }
        System.out.println("Updated stack:"+st);
    }
}






