package Stacks;
import java.util.Stack;
public class PushElementAtGivenIndex {
        public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: "+st);
        int indx = 2;
        Stack<Integer> helper = new Stack<>();
        while(st.size() > indx){
            helper.push(st.pop());
        }
         st.push(55); 
        while(helper.size() > 0){ 
            System.out.println(st);
            st.push(helper.pop());
            System.out.println("st is" +st);
        }
        System.out.println("Updated stack:"+st);
    }
}

