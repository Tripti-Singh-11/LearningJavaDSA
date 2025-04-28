package StringsAndStringBuilder;
public class UpdateEvenPositions {
   public static void main(String[] args) {
    String s= "Excellent";
    String str=" ";
    for(int i=0;i<s.length();i++){
        if(i%2==0) str+='a';
        else str+= s.charAt(i);
    }
    System.out.println(str);
    System.out.println();

    //use of equals()
    String a= "Excellent";
    String b= "Excellent";
    String c= new String(a);
    String d = "Exce";
    d+= "llent";
    System.out.println(a==b);
    System.out.println(a==c);          //check address
    System.out.println(a.equals(c));      //check characters line by line
    System.out.println(a==d);
    System.out.println(a.equals(d));
   } 
}


