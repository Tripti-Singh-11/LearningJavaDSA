package Conditionals;
import java.util.Scanner;
public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st side of triangle");
        int a=sc.nextInt();
        System.out.println("enter 2nd side of triangle");
        int b=sc.nextInt(); 
        System.out.println("enter 3rd side of triangle");
        int c=sc.nextInt();
        if((a+b>c) && (b+c>a) && (c+a>b)){
        System.out.println("valid triangle");
        }  
        else  {
            System.out.println("invalid triangle") ;
        }
    }
}
