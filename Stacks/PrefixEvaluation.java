package Stacks;
import java.util.Stack;
public class PrefixEvaluation {
    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';  
    }
    public static int calculation(char operator, int val1, int val2) {
        if (operator == '+') return val1 + val2;
        if (operator == '-') return val1 - val2;
        if (operator == '*') return val1 * val2;
        return val1 / val2; 
    }
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        String prefix = "-+-9+*53/8234";
        System.out.println("Prefix: " + prefix);
        System.out.println();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (isDigit(ch)) {
                val.push(ch - '0');
            } 
            else {
                if (val.size()<2) {
                    System.out.println("Not enough operands for operator: " + ch);
                    return;
                }
                int val1 = val.pop();
                int val2 = val.pop();
                val.push(calculation(ch, val1, val2));
                System.out.println("val " + ch + " : " + val1 + "  " + ch + "  " + val2 + "  =  " + val);
            }
        } System.out.println();
        if (val.size() == 1) {
            System.out.println("Final result = " + val.pop());
        } else {
            System.out.println("Invalid Expression!");
        }
    }
}



