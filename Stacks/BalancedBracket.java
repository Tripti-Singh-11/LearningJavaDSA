package Stacks;
import java.util.Stack;
import java.util.Scanner;
public class BalancedBracket {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter brackets");
    String str = sc.next();
    System.out.println(balancedbrackets(str));
    }
    public static boolean balancedbrackets(String str){
     Stack<Character> st = new Stack<>();
    int n  = str.length();
    for(int i=0;i<n;i++){
        char ch = str.charAt(i);
       if(ch =='('){
        st.push(ch);
       }
       else{
        if(st.size()==0 ) return false;
        if(st.peek()=='('){
            st.pop();
        }
       }
    }
    if(st.size()>0) return false;
    else return true;
    }
   
}
