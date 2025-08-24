package HashmapAndHashSet;
import java.util.HashMap;
public class AnagramCheck {
public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        AnagramCheck obj = new AnagramCheck();
        boolean result = obj.isAnagram(s, t);

        if (result)
            System.out.println(s + " and " + t + " are anagrams.");
        else
            System.out.println(s + " and " + t + " are NOT anagrams.");
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> smap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            smap.put(key, smap.getOrDefault(key, 0) + 1);
        }

        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            tmap.put(key, tmap.getOrDefault(key, 0) + 1);
        }

        for (char key : smap.keySet()) {
            if (!tmap.containsKey(key) || !smap.get(key).equals(tmap.get(key))) {
                return false;
            }
        }
        return true;
    }
}


