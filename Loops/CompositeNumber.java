package Loops;

import java.util.Scanner;

public class CompositeNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        boolean x = false;  
        for(int i = 2; i<=n/2; ++i){
            if(n%i == 0){
                System.out.println(n+" is Composite Number.");
                x = true; 
                break;
            }
        }
        if(n== 1){
            System.out.println(n +" is Neither Prime nor Composite.");
        }
        else if(x == false){
            System.out.println(n+" is prime Number.");
        }
    }
}
