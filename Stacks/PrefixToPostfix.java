package Stacks;
import java.util.Stack;
public class PrefixToPostfix {
   public static void main(String[] args) {
    Stack<String> val = new Stack<>();
     String prefix = "-+-9+*53/8234";
     for(int i=prefix.length()-1;i>=0;i--){
        char ch = prefix.charAt(i);
        if(ch>='0' && ch<='9'){
            val.push(ch + "");
        }
        else{
            String val1 =val.pop();
            String val2 = val.pop();
            char op =ch;
            String t = val1 +val2 +op;
            val.push(t);
        }
    }
    System.out.println(val.peek());
   }
}
