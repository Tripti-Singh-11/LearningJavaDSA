package StringsAndStringBuilder;
public class Stringbuildfunctions {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("keep");
        StringBuilder ab =new StringBuilder("smile");
        System.out.println(sb);
        System.out.println(ab);
        System.out.println(sb.reverse());
        System.out.println(ab.reverse());
        System.out.println(sb.compareTo(ab));
        System.out.println(ab.compareTo(sb));
    }
}
