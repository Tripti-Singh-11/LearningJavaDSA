package PatternPrinting;
import java.util.Scanner;
public class Rectanglestar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(i+ "  ");
            }
            System.out.println("   ");
        }
    }
}
