package StringsAndStringBuilder;
public class DeleteandInsert {
public static void main(String[] args) {
    StringBuilder sb =new StringBuilder("Coding");
    System.out.println(sb);
    sb.deleteCharAt(2);
    System.out.println(sb);
    sb.append("world");
    System.out.println(sb);
    sb.delete(2, 07);
    System.out.println(sb);
    sb.insert(2,"best");
    System.out.println(sb);
}    
}
