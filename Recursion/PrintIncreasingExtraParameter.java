package Recursion;
import java.util.Scanner;
public class PrintIncreasingExtraParameter {
   public static void print(int x ,int n) {
        if(x>n) return;
         System.out.println(x);
         print(x+1,n);
     }
     public static void main(String[] args) {
     java.util.Scanner sc = new Scanner(System.in);
     System.out.print("enter n");
     int n = sc.nextInt();
     print( 1,n); 
     }
 }
