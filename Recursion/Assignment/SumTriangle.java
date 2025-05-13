package Recursion.Assignment;
import java.util.Arrays;
public class SumTriangle {
    public static void printSumTriangle(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return;
        }
        int[] nextLevel = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nextLevel[i] = arr[i] + arr[i + 1];
        }
        printSumTriangle(nextLevel);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Sum Triangle:");
        printSumTriangle(arr);
    }
}
