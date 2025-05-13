package Recursion;
import java.util.Scanner;
public class PowerLogarithmic {
    public static int pow(int n, int m) {
        if (m == 0) return 1;  //tc 0(m)
        return n * pow(n, m - 1); 
    }
    public static int pow2(int n, int m) {
    if (m == 0) return 1;  //tc 0(log m)
    int ans = pow2(n,m/2);
    if(b%2==0) return ans*ans;
    else return ans*ans*n;
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












