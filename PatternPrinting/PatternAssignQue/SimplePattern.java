package PatternPrinting.PatternAssignQue;
import java.util.Scanner;
public class SimplePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n;j++)
                System.out.print(i+ " ");
            System.out.println(" ");}
        }
    }

