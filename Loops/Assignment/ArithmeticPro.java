package Loops.Assignment;

import java.util.Scanner;

public class ArithmeticPro {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n:");
        int n = scan.nextInt();
        System.out.print("enter a:");
        int a = scan.nextInt();
        System.out.print("enter d:");
        int d = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            System.out.println(a);
            a+=d;
        }
        scan.close();
    }
}
