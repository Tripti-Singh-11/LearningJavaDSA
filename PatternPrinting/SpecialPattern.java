
package PatternPrinting;
import java.util.Scanner;
public class SpecialPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        int A=65; int B=1;
        for(int j=1;j<=i;j++){
            if(i%2==0)
            System.out.print((char)A+ " ");
            else
            System.out.print(B+ " ");
            A++;
            B++;
        }
        System.out.println(  );
    }
    }
}