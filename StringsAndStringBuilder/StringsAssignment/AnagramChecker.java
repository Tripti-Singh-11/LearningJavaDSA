package StringsAndStringBuilder.StringsAssignment;
import java.util.*;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first string: ");
        String n1 = sc.nextLine();
        System.out.print("Enter  second string: ");
        String n2 = sc.nextLine();
        boolean isAnagram = areAnagrams(n1, n2); 
        System.out.println(isAnagram); 
    }
    public static boolean areAnagrams(String n1, String n2) {
        if(n1.length()!=n2.length()) {
            return false;
        }
         n1=sortString(n1);
         n2=sortString(n2);
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)!=n2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
