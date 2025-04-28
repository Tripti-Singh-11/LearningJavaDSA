package PatternPrinting.PatternAssignQue;
import java.util.Scanner;
public class HollowDiamondShape {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int i=0;
    for (i = 1; i < n; i++) {
        for(int j = 1; j<=n; j++){
           if(i+j<=n+1) System.out.print("*");
           else 
           System.out.print(" ");
        }
        for(int j=1;j<n;j++){
            if(j+1>=i)      
            System.out.print("*");
            else 
            System.out.print(" ");
        }
        System.out.println();
    }
           
    for( i=1;i<=n;i++){
        for (int j=1;j<=n;j++){
            if(j<=i)
            System.out.print("*");
            else 
            System.out.print(" ");
        }
        for(int j=1;j<n;j++){
            if(j+i>=n)
            System.out.print("*");
            else
            System.out.print(" ");
            }
            System.out.println();
    }
    }
}                    
                                                            





