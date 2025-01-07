package Conditionals;

import java.util.Scanner;
public class Check5DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(9999< n && n <=99999)
        System.out.println("5 digit number");
        else 
        System.out.println("not a 5 digit number");
        
    }
}
