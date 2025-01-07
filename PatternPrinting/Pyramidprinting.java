// package PatternPrinting;
// import java.util.Scanner;
// public class Pyramidprinting {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter your number");
//         int n =sc.nextInt();
        
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" " +" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*" +" ");
//             }System.out.println();
// }
//     } }




package PatternPrinting;
import java.util.Scanner;
public class Pyramidprinting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n =sc.nextInt();
        int nos=n-1;
        int nostar=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" " +" ");
            }
            for(int j=1;j<=nostar;j++){
                System.out.print("*" +" ");
                // System.out.print(j +" ");
               // System.out.print(i+" ");
            }System.out.println();
            nos--;
            nostar+=2;
}
    } }