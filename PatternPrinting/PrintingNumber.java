
package PatternPrinting;

import java.util.Scanner;

public class PrintingNumber {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+ " ");
            }
            System.out.println("   ");
        }
    }
}
