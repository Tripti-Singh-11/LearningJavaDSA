package Recursion;
import java.util.Scanner;
public class StairPath {
    public static int countways(int n){
        if(n==1 || n==2) return n;
        return countways(n-1)+countways(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println( countways(n));
        scan.close();
    }
}


