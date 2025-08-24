package Stacks;
import java.util.Stack;
public class PostfixToInfix {
    public static void main(String[] args) {
    String postfix = "953*82/+-3+4-";
    Stack<String> val = new Stack<>();
     for(int i=0; i<postfix.length(); ++i){
        char ch = postfix.charAt(i);
        if(ch>='0' && ch<='9'){
            val.push(ch + "");
        }
        else{
            String val2 =val.pop();
            String val1 = val.pop();
            char op =ch;
            String t = "("+ val1 +op + val2 +")";
            val.push(t);
        }
    }
    System.out.println(val.peek());
    }
}



