package PatternPrinting;
import java.util.Scanner;
public class FloydTriangle{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        int ch =65;
        for(int j=1;j<=i;j++){
            System.out.print((char)(ch-1+i)+"  ");
        }
        System.out.println("   ");
    }
}
}              
