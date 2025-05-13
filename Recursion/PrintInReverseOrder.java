package Recursion;
import java.util.Scanner;
public class PrintInReverseOrder {
    public static void printInReverseOrder(int n){
        if(n==0) return; 
        System.out.println(n); 
        printInReverseOrder(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        printInReverseOrder(n);
        scan.close();
    }
}





