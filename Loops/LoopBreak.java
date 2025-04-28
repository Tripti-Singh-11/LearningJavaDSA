package Loops;
import java.util.Scanner;
public class LoopBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i<n){
            if(n%i==0)
            System.out.println(i);
            else break;
            i++;
        }
        System.out.println("prime");
        sc.close();
    }
}
