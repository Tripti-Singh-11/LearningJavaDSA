package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class ConcantenateWithReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        String reversestring =new StringBuilder(s).reverse().toString();
        System.out.println("Reversestring : "+reversestring);
        String result= s + reversestring;
        System.out.println(result);

    }
}
