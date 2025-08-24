package Stacks;
import java.util.Stack;
public class PostFixEvaluation {
    public static boolean isDigit(char ch ){
    return (ch>='0' && ch<='9');
    }
    public static int calculation(int val1 ,int val2 ,char operator){
        if(operator == '+') return val1 + val2;
        if(operator == '-') return val1 - val2;
        if(operator == '*') return val1 * val2;
        else return (val1 / val2);
    }
    public static void main(String[] args) {
    Stack<Integer> val = new Stack<>();
    String postfix = "953*82/+-3+4-";
    System.out.println("postfix  " + postfix);
    for(int i = 0;i<postfix.length(); i++){
        char ch = postfix.charAt(i);
        if(isDigit(ch)){
            val.push(ch-'0');
        }
        else {
            int val2= val.pop();
            int val1 = val.pop();
            val.push(calculation(val1, val2, ch));
            System.out.println("val "+ val);
        }
    }
        int res = val.pop();
        System.out.println("Final res  " + res);
    }
   } 

