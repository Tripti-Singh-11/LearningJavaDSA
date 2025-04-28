package Loops.Assignment;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        int m,a,b,gcd=0;
        Scanner sc=new Scanner(System.in);
      
        a= sc.nextInt();
        b= sc.nextInt();
        if(a<b)
            m=a;
            else m=b;
            for(int i=1;i<=m;i++){
                if(a%i==0&&b%i==0){
                    gcd=i;
                }
            }
            System.out.println(gcd);
    }
}
