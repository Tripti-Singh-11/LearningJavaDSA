package Conditionals.Assignment;
import java.util.Scanner;
public class FindYoungest {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("enter  the age of Rupenzal");
    int a=sc.nextInt();
    System.out.println("enter  the age of lovely");
    int b=sc.nextInt();
    System.out.println("enter  the age of chindrella");
    int c=sc.nextInt();
    if((a<b || a<c))
    System.out.println(a+"is yougest");
    else if((b<c || b<a))
    System.out.println(b+"is yougest");
    //if((a<b || a<c))
    else
    System.out.println(c+"is yougest");
}
}