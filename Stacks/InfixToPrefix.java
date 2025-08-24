package Stacks;
import java.util.Stack;
public class InfixToPrefix {
    public static boolean isDigit(char ch) {
        return (ch >= '0' && ch <= '9');
    }
    public static boolean checkPriority(char op, char ch) {
        if ((op == '+' || op == '-') && (ch == '+' || ch == '-')) return true;
        if ((op == '+' || op == '-') && (ch == '*' || ch == '/')) return false;
        return true;
    }
    public static void main(String[] args) {
        String infix = "9-(5*3+8/2)+3-4";
        System.out.println("infix : " + infix +" ");
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (isDigit(ch)) {
                val.push("" + ch);
            } 
            else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek()!= '(') {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    String s = operator + val1 + val2;
                    val.push(s);
                }
                op.pop(); // remove '('
            } 
            else {
                while (!op.isEmpty() && op.peek()!= '(' && checkPriority(op.peek(), ch)) {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    String s = operator + val1 + val2;
                    val.push(s);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            String val2 = val.pop();
            String val1 = val.pop();
            char operator = op.pop();
            String s = operator + val1 + val2;
            val.push(s);
        }

        System.out.println("Prefix: " + val.pop());
    }
}
