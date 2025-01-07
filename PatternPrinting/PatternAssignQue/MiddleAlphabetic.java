package PatternPrinting.PatternAssignQue;
import java.util.Scanner;
public class MiddleAlphabetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=64;
            for(int j=1;j<=n;j++){
                if(j<=n-i)System.out.print(" ");
                else{
                     System.out.print((char)(a+i));
                a--;
                }
            }
            if(i>=2){
                for(int j=1;j<=i-1;j++){
                    System.out.print((char) (j+65));
                }
            }
            System.out.println();
        }
    }  
}
