package PatternPrinting.PatternAssignQue;
import java.util.Scanner;
public class Numbridge {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your number");
    int n =sc.nextInt();
    
    for(int i=1;i<=2*n-1;i++){
       if(i>n)System.out.print(2*n-i); 
       else System.out.print(i);
    }
    System.out.println( );
    n--;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n+1-i;j++){
            System.out.print(j);
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print(" ");
        }
        // for(int j=1;j<=n+1-i;j++){
            for(int j=n-i+1;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
    }
}

}

                        