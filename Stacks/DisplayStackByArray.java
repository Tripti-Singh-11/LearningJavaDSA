package Stacks;
import java.util.Stack;
public class DisplayStackByArray {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    int n = st.size();
    int[] arr = new int[n];
    for(int i= n-1; i>=0; i--){
        arr[i] = st.pop();
    System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        st.push(arr[i]);
    }
    System.out.println();
    System.out.println(st);
}
}
