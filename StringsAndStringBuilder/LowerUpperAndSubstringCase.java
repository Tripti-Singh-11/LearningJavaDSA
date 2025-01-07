package StringsAndStringBuilder;
public class LowerUpperAndSubstringCase {
  public static void main(String[] args) {
    String x="My Coding";
    System.out.println(x.toLowerCase());
    System.out.println(x.toUpperCase());
    String a=x.toLowerCase();
    System.out.println(a);
    System.out.println();

    //Substring
    String s="Smiley";
    System.out.println(s.substring(1));
    System.out.println(s.substring(1, 4));
    System.out.println(s.substring(3,3));
    System.out.println(s.substring(0, 6));
    System.out.println();

    //print all substrings
    for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            System.out.print(s.substring(i,j)+" ");
        }
        System.out.println();
    } 
 }
    
    
}
