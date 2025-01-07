package Conditionals;
import java.util.Scanner;
public class CheckQuadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("enter y");
        int y = sc.nextInt();
       
        if(x>0 && y>0) System.out.println("1st quadrant");
        if(x<0&&y>0) System.out.println("2nd quadrant");
        if(x<0&&y<0) System.out.println("3rd quadrant");
        if(x>0&&y<0) System.out.println("4th quadrant");
        if(x==0&&y==0) System.out.println("origin");
        if(x==0) System.out.println("lies on y axis");
        if(y==0) System.out.println("lies on x axis");
         }
    
}
