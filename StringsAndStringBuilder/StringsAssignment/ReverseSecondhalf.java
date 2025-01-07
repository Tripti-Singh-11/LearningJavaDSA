package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class ReverseSecondhalf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        if(s.length()%2!=0){
            System.out.println("The string must have an even length.");
            return ;
        }
        String firsthalf=(s.substring(0, s.length()/2));
        String secondhalf=(s.substring(s.length()/2));
        String reversedSecondHalf = new StringBuilder(secondhalf).reverse().toString();
        String result = firsthalf + reversedSecondHalf;
        System.out.println("Result: " + result);
    }
}

