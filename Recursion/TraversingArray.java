package Recursion;
public class TraversingArray {
    public static void printArray(int i, int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        printArray(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,4,6,7,-1,1};
        printArray(0,arr);
    }
}