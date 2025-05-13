package Recursion.Assignment;
import java.util.Scanner;
public class StairPath {
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = scanner.nextInt();
        int ways = countWays(n);
        System.out.println("Number of ways to climb " + n + " stairs is: " + ways);
    }
}
