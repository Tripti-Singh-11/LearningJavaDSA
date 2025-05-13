package Recursion.Assignment;
import java.util.Scanner;
public class DecimalToBinary {
    public static void convertToBinary(int n) {
        if (n == 0) {
            return;
        }
        convertToBinary(n / 2);  
        System.out.print(n % 2); 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scan.nextInt();
        scan.close();
        if (num == 0) {
            System.out.print("0"); 
        } else {
            convertToBinary(num);
        }
    }
}
