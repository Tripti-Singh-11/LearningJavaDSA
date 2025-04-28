package Loops;

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       int flag= 0;
        for(int i=1;i<=n;i++){
           if(n%2==0) {
         System.out.println("even");
         flag =1;
         break;
          }
        }
         if(flag==0){
         System.out.println("odd");
        }
        }
    }


