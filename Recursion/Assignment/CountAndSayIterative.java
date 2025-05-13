package Recursion.Assignment;
import java.util.Scanner;
public class CountAndSayIterative {
public static String countAndSay(int n) {
    if (n == 1) return "1";
    String result = "1";
    for (int i = 2; i <= n; i++) {
    StringBuilder next = new StringBuilder();
    int count = 1;
    for (int j = 1; j < result.length(); j++) {
    if (result.charAt(j) == result.charAt(j - 1)) {
    count++;
    } else {
    next.append(count).append(result.charAt(j - 1));
    count = 1;
    }
    }
    next.append(count).append(result.charAt(result.length() - 1));
    result = next.toString();
    }
    return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.println(countAndSay(n));
        scan.close();
    }
}
