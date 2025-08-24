package Stacks;
import java.util.Stack;
import java.util.Scanner;
public class RemoveConsecutiveSequences {
    public static int[] removeConsecutive(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } 
            else if(i < n - 1 && arr[i] == st.peek() && arr[i] != arr[i + 1]) {
                st.pop();
            } 
            else if(i == n - 1 && st.peek() == arr[i]) {
                st.pop();
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size()-1; i>= 0; --i) {
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Given Array is: ");
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] ans = removeConsecutive(arr);
        System.out.print(" Array is: ");
        for(int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
