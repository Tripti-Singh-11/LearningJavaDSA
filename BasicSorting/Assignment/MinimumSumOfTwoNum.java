package BasicSorting.Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class MinimumSumOfTwoNum {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();
        int[] digits=new int[n];
        for(int i=0;i<n;i++){
            digits[i] = sc.nextInt();
        }
        Arrays.sort(digits);
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<n;i++){
            if(i%2==0) num1 = num1*10+digits[i];
            else num2 = num2*10+digits[i];
        }
        System.out.println(num1 + " " + num2 );
        System.out.println( num1+num2);
    }
}
