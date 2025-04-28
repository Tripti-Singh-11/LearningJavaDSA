// package basics;

// import java.util.Scanner;

// public class AirthmeticCalculator {
//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//         System.out.println("enter operation");
//         char op= sc.next().charAt(0);
//         System.out.println("enter x");
//         int x = sc.nextInt();
//         System.out.println("enter x");
//         int y = sc.nextInt();
//         System.out.println("Your solution is:");
//         if(op=='+')System.out.println(x+y);
//         if(op=='-')System.out.println(x-y);
//         if(op=='*')System.out.println(x*y);
//         if(op=='/')System.out.println(x/y);

//     }
// }
     


//by switch case

package Loops;
import java.util.Scanner;
public class AirthmeticCalculator {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter operation");
        char op= sc.next().charAt(0);
        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("enter y");
        int y = sc.nextInt();
        System.out.println("Your solution is:");
        switch(op){
            case '+' :
        System.out.println(x+y);
        break;
        case '-' :
        System.out.println(x-y);
        break;
        case '*' :
        System.out.println(x*y);
        break;
        case '/' :
        System.out.println(x/y);
        break;
        default:
        System.out.println("invalid");
        }
    }
}
