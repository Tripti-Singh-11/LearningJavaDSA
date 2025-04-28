package StringsAndStringBuilder;
import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);


        //inputstringbuilder
        StringBuilder sb =new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'a');
        sb.setCharAt(4,'a');
        System.out.println(sb);
    }
}
