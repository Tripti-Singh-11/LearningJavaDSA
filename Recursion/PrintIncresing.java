package Recursion;
import java.util.Scanner;
public class PrintIncresing {
    static int n ; //global
  public static void print(int x ) {
       if(x>n) return;
        System.out.println(x);
        print(x+1);
    }
    public static void main(String[] args) {
    java.util.Scanner sc = new Scanner(System.in);
    System.out.print("enter n");
    n = sc.nextInt();
    print( 1); 
    }
}












//after call
// package Recursion;
// import java.util.Scanner;
// public class PrintIncresing {
//   public static void print(int n) {
//        if(n==0) return;
//         System.out.println(n);
//         print(n-1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//     java.util.Scanner sc = new Scanner(System.in);
//     System.out.print("enter n");
//     int n = sc.nextInt();
//     print( n); 
//     }
// }