package Recursion.Assignment;
import java.util.Scanner;
public class FindElementIndex {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the element to search: ");
    int x = sc.nextInt();
    int index = -1;
    for (int i = 0; i < n; i++) {
     if (arr[i] == x) {
    index = i;  
    break;
    }
    }
     if (index != -1) {
         System.out.println("Element " + x + " found at index: " + index);
    } else {
        System.out.println("-1");
    }
    }
}
