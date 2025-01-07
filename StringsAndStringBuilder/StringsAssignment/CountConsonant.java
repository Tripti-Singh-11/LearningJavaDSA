package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class CountConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
         s= s.toLowerCase();
        int countConsonant =0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' &&!(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                countConsonant++;
            }
        }
        System.out.println(countConsonant);
    }
}
