package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int largest =-1;
        int Secondlargest=-1;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch>='0' || ch<='9'){
                int digit = ch-'0';
                if(digit>largest){
                Secondlargest = largest;
                largest=digit;
                }
                else if(digit>Secondlargest && digit != largest){
                Secondlargest=digit;
                }
            }
        }
        if(Secondlargest==-1){
            System.out.println("no second largest digit  found");
        }
        else {
            System.out.println("FirstLargest" + " " + largest);
            System.out.println( "SecondLargest"+ " " + Secondlargest);
        }
    }
}
