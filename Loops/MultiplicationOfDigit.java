package Loops;
import java.util.Scanner;
public class MultiplicationOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int mul=1;
        while(n!=0){
         
            mul = mul*(n%10);
            n/=10;
        }
        System.out.println(mul);

    }
    
}
