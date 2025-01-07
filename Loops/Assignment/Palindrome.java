package Loops.Assignment;
// import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String str="madam"  ,rStr =" " ;
        int strLength =str.length();
        for(int i=(strLength-1);i>=0;--i){
            rStr =rStr +str.charAt(i);
        }
    if (str.equals(rStr)){
        System.out.println(str + "is a Palindrome String");
    }
    else{
        System.out.println(str + "is not a Palindrome String");}
    }
}
