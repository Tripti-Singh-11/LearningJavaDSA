package PatternPrinting.PatternAssignQue;
import java.util.Scanner;
public class Kitepattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<n-i+1;j++){
            System.out.print(" "+ " ");
        }
        for(int j=1;j<=2*i-1;j++){
           if(j==1||j==2*i-1||i==n||j==i) 
           System.out.print("*"+" ");
          else System.out.print(" "+" ");
        }System.out.println();
    }
        
    for(int i=2;i<n+1;i++){
        for(int j=1;j<=2*n-i;j++){
            if(i==j||(i+j)==2*n||j==n){
                System.out.print("*" +" ");}
                else System.out.print(" "+" ");
        }
                System.out.println();
    }
    }
}
  



