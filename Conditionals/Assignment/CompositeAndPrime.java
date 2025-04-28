package Conditionals.Assignment;
import java .util.Scanner;
public class CompositeAndPrime {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter number");
      int n =sc.nextInt();

      int flag=0;
      for(int i=2;i<=n-1;i++){
      if(n%i==0){
      System.out.println("composite number");
      flag=1;
      break;
      }
    }   
      if(n==0||n==1){
        System.out.println(" nor composite nor prime number");
         }
      else{
      if(flag==0){
        System.out.println("prime number");
     }  
    }
 sc.close();
}
}
 