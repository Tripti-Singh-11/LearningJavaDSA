package Recursion;
import java.util.Scanner;
public class StringTraversal {
        public static void printString(int i, String s){
        if(i==s.length()) return;
        System.out.println(s.charAt(i));
        printString(i+1, s);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = new String(scan.nextLine());
        printString(0,s);
        scan.close();
    }
}




