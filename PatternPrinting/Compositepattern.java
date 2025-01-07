package PatternPrinting;
import java.util.Scanner;
public class Compositepattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
             if(i+j>n)
            System.out.print(" "+  " ");
             else 
             System.out.print(j+" ");
            }
             System.out.println( );
            sc.close();   
        }
                    
    }
}









// package PatternPrinting;
// import java.util.Scanner;
// public class Compositepattern {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter your number");
//         int n =sc.nextInt();
//         int a=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" "+"  ");
//             }
//             // int a=1;
//             for(int j=1;j<=i;j++){
//            // System.out.print(j+  " ");
//            // System.out.print(i+  " ");
//            //System.out.print("*" +  " ");
//            //System.out.print((char)(j+64)+ " ");
//            System.out.print(a+  "  ");
//            a=a+2;
//             }
//              System.out.println( );}
//             }
                    
//     }

