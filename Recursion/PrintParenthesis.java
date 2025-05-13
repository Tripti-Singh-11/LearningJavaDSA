package Recursion;
import java.util.Scanner;
public class PrintParenthesis {
    public static void printParentheses(int n, String ans,int openbracket,int closebracket){
        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if(openbracket<n) printParentheses(n, ans+"(",openbracket+1,closebracket);
        if(closebracket<n && closebracket<openbracket)printParentheses(n, ans+")",openbracket,closebracket+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        printParentheses(n,"",0,0);
        scan.close();
    }
}










