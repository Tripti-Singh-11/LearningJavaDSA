package Recursion;
public class RemoveAllOccurences {
    public static void removeOccurences(int i, String s, char ch, String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!=ch) ans += s.charAt(i);
        removeOccurences(i+1, s, ch, ans);
    }
    public static void main(String[] args) {
        String s = "Princess";
        removeOccurences(0,s,'s',"");
    }
}






