package Recursion;
import java.util.ArrayList;
public class SubsetsOfString {
    static ArrayList<String> arr= new ArrayList<>();
    public static void printAllSubsets(int i, String s, String ans){
        if(i==s.length()){
           arr.add(ans);
            return;
        }
       printAllSubsets(i+1, s, ans); //(skip a character)
       printAllSubsets(i+1, s, ans+s.charAt(i)); //(do not skip a character)
    }
    public static void main(String[] args) {
        String s = "abc";
        arr= new ArrayList<>();//reset
        printAllSubsets(0,s,"");
        System.out.println(arr);
    }
}

