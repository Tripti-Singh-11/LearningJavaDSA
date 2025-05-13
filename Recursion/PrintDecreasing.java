package Recursion;
import java.util.Scanner;
public class PrintDecreasing {
    public static void print(int n ) {
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
    java.util.Scanner sc = new Scanner(System.in);
    System.out.print("enter n");
    int n = sc.nextInt();
    print( n); 
    }
}


