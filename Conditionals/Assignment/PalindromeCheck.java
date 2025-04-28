package Conditionals.Assignment;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter  number");
    int originalvalue=sc.nextInt();
        int reverse=0;
        int temp =originalvalue;

        while(temp!=0){
            int lastdigit=temp %10;
            reverse= reverse *10 + lastdigit;
            temp/=10;
        }
        if(originalvalue == reverse)
        {
            System.out.println("palindrome");
        }
        else{
        System.out.println("not palindrome");
        }
        sc.close();
    }  
}
