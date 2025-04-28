package ArrayandArraylist;
import java.util.Scanner;
public class SortZeroOnesByOnePass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
            int i = 0;
            int j = n - 1;
        // Sorting 0s and 1s
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else { // arr[i] == 1 && arr[j] == 0
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        System.out.println("Sorted array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
