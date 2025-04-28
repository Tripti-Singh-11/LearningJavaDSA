package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class SubstringContainVowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int vowelSubstringsCount = countVowelSubstrings(input);
        System.out.println("Number of substrings containing only vowels: " + vowelSubstringsCount);
    }
        public static int countVowelSubstrings(String input) {
            int count = 0;
            int n = input.length();
            String vowels = "aeiouAEIOU";
            int vowelSequenceLength = 0;
            for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                vowelSequenceLength++;
                count += vowelSequenceLength; 
                }
                else {
                vowelSequenceLength = 0; 
                }
            }
            return count;
    }
}
