package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class StringtoInt {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String s=sc.nextLine();
        if(s.length()>=10){
        System.out.println("enter the length of numeric string less than 10");
        return;
        }
        int result =0;
        for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
            if(ch>'9'||ch<'0'){
            System.out.println("Invalid input. The string must contain only numeric digits.");
             return;
            }
            int digit =ch-'0';
            result=result*10+digit;
        }
          System.out.println(result);
    }
}
 