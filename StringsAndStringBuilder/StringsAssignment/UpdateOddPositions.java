package StringsAndStringBuilder.StringsAssignment;
import java.util.Scanner;
public class UpdateOddPositions {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String input=sc.nextLine();
        StringBuilder sb =  new StringBuilder(input);
          for(int i=0;i<sb.length();i++){
          if(i%2!=0) sb.setCharAt(i, '#');
          }
        System.out.println(sb.toString());
    }  
}
