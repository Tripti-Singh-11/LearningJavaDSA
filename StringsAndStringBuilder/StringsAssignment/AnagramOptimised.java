package StringsAndStringBuilder.StringsAssignment;
import java.util.*;
public class AnagramOptimised {
    public static void main(String[] args) {
        String[] arr = {"listen", "silent", "enlist"};
        boolean isAnagram = areAnagrams(arr);
        System.out.println("anagram "+" " + isAnagram);
    }
    public static boolean areAnagrams(String[] arr) {
        if (arr.length <= 1) return true; 
        int[] baseFreq = getFrequency(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Arrays.equals(baseFreq, getFrequency(arr[i]))) {
                return true; 
            }
        }
        return false;
    }
    public static int[] getFrequency(String str) {
        int[] freq = new int[26]; 
        for (char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch); 
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++; 
            }
        }
        return freq;
    }
}


