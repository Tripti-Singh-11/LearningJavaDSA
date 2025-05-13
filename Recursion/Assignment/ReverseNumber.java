package Recursion.Assignment;
public class ReverseNumber {
    public static int reverseNumber(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int digit = num % 10;
        rev = rev * 10 + digit;
        return reverseNumber(num / 10, rev);
    }
    public static int reverse(int num) {
        return reverseNumber(num, 0);
    }
    public static void main(String[] args) {
        int number = 1020;
        int reversed = reverse(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }
}
