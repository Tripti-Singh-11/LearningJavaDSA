package Stacks;
import java.util.Stack;
public class OptimisedNextGreatestElement {
public static void print(int[] arr,int[] res){
     System.out.print("Original Array: ");
    for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
     System.out.print("Next Greater Elements: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
} 
public static void main(String[] args) {
    int[] arr={1,2,5,3,6,4,8,5};
    int[] res = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        while (st.size()>0 && st.peek()<arr[i]) {
            st.pop();
        }
        if(st.size()==0) res[i]=-1;
        else res[i]=st.peek();
        st.push(arr[i]);
        }
        print(arr,res);
    }
}

