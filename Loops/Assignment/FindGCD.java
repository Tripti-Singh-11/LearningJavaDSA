package Loops.Assignment;
import java.util.Scanner;
public class FindGCD {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first number");
    int t=sc.nextInt();
    System.out.println("Enter second number");
    int l=sc.nextInt();
    System.out.println("GCD is:");
    int gcd=0;
    for(int i=1;i<=t&&i<=l;i++)
    {
        if(t%i==0 && l%i==0)
        gcd=i;
    }
    System.out.println(gcd);

 }   
}
