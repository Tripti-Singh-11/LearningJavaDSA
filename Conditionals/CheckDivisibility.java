package Conditionals;
import java.util.Scanner;
public class CheckDivisibility {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if (n % 5==0 || n % 3==0)
            System.out.println("Divisible by 5 or 3");
        else 
            System.out.println("Not divisible");
            sc.close();
        
    }
    
}

                    
                    


