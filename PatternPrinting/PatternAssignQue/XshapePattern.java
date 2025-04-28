package PatternPrinting.PatternAssignQue;

import java.util.Scanner;

public class XshapePattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<2*n;i++){
        for(int j=1;j<2*n;j++){
            if(i<n){
                if(j<=i||i+j>2*n-1)
                System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            else if(i==n)  
            System.out.print("*"+" ");
            else if(i>n){
                if(i+j<=2*n||i<=j)
                System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
        }
        System.out.println();
    }
    }
}
