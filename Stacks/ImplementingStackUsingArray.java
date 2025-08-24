package Stacks;
public class ImplementingStackUsingArray {
    static class Stack {
        private int[] st = new int[10];
        private int top = -1;
        private int size = 0;
        public void push(int x) {
            if (top == st.length - 1) {
                throw new Error("Stack OverFlow...");
            }
            st[++top] = x;
            ++size;
        }
        public int pop() {
            if (top == -1) {
                throw new Error("Stack Underflow...");
            }
            int x = st[top];
            st[top] = 0;
            --top;
            --size;
            return x;
        }
        public int peek() {
            if (top == -1) {
                throw new Error("Stack Underflow...");
            }
            return st[top];
        }
         public int size() {
            return size;
        }
         public boolean isEmpty() {
            return size == 0;
        }
        public boolean isFull() {
            return size == st.length;
        }
        public int capacity() {
            return st.length;
        }
        public void display() {
            for (int i = 0; i < size; ++i) {
                System.out.print(st[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10); 
        st.push(20); 
        st.push(30);
        st.push(40);    
        st.push(50); 
        st.push(60);  
        st.display(); 
        System.out.println(st.pop()); 
        st.display(); 

        System.out.println(st.peek());
        st.display(); 

        System.out.println(st.size()); 
        System.out.println(st.capacity()); 
        System.out.println(st.isEmpty()); 
        System.out.println(st.isFull()); 
    }
}
