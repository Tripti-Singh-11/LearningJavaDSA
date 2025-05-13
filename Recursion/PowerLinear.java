package Recursion;
import java.util.Scanner;
public class PowerLinear {
    public static int pow(int n, int m) {
        if (m == 0) return 1; 
        return n * pow(n, m - 1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int m = sc.nextInt();
        int result = pow(n, m); 
        System.out.println(n + " raised to the power " + m + " is " + result);
    }
}












