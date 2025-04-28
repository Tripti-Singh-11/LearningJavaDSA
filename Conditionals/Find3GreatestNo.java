package Conditionals;
import java.util.Scanner;

public class Find3GreatestNo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt(); 
        System.out.println("enter 3rd number");
        int c=sc.nextInt();
        if(a>=b && a>=c) {
            System.out.println(a+"is greater");
        }
       else if(b>=c && b>=a){
            System.out.println(b+"is greater");
        }
       else {
        System.out.println(c+"is greater");
       }
}
}
