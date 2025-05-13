package Recursion;

import java.util.Scanner;
public class WithoutConsecutiveOnesBinaryString {
     public static void printBinaryString(int n,String ans){
        int m=ans.length();
        if(m==n){
            System.out.println(ans);
            return;
        }
        printBinaryString(n, ans+"0");
        if(m==0 || ans.charAt(m-1)!='1') printBinaryString(n, ans+"1");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        printBinaryString(n,"");
        scan.close();
    }
}

