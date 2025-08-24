package Stacks;
import java.util.Stack;
public class NextGreatestElementMethod2 {
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
       st.push(0);
        for(int i=1; i<arr.length; ++i){
            while(st.size()>0 && arr[st.peek()]<arr[i]){
                res[st.peek()] = arr[i];
               st.pop();
            }
           st.push(i);
        }
        while(st.size()>0){
            res[st.pop()] = -1;
        }
        print(arr,res);
    }
}
