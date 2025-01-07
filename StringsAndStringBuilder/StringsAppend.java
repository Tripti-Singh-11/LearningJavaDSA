package StringsAndStringBuilder;
public class StringsAppend {
  public static void main(String[] args) {
    StringBuilder s =new StringBuilder("Abc");
    System.out.println(s);
    s.append(35);
    System.out.println(s);
    s.append('*');
    System.out.println(s);
    s.append("hello");
    System.out.println(s);
    char[] ch ={'h','i','i'};
    s.append(ch);
    System.out.println(s);
    int[] arr={1,2,3,5};
    s.append(arr); //doesn't work,address is appended
    System.out.println(s);
    StringBuilder a =new StringBuilder("xyz");
    s.append(a);
    System.out.println(s);
  }  
}
