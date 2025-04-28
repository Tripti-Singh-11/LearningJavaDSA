package PatternPrinting.PatternAssignQue;
import java.util.Scanner;
public class Numberleftpyramid{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int a;
    for(int i=1;i<=n;i++){
        a=i;
        for(int j=1;j<=i+1-1;j++){
            System.out.print(a+ " ");
            a--;
        }System.out.println();
    }
  }  
}
