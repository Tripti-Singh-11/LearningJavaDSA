package StringsAndStringBuilder;
public class IndexOf {
    public static void main(String[] args) {
    String str="Be Positive";
    System.out.println(str.indexOf('a'));
    System.out.println(str.indexOf('e'));
    System.out.println(str.indexOf('\0'));
    System.out.println(str.lastIndexOf('e'));
    System.out.println(str.lastIndexOf('s'));
    System.out.println();

    String a="abc";
    String b="zyx";
    System.out.println(a.compareTo(b));
    String c="abc";
    String d="abcff";
    System.out.println(c.compareTo(d));
    String x="abc";
    String y="aei";
    System.out.println(x.compareTo(y));
    System.out.println();

    String t = "Always Keep Smile";
    System.out.println(t.contains("eep"));
    System.out.println(t.contains("smile"));
    System.out.println(t.startsWith("Always"));
    System.out.println(t.startsWith("Al"));
    System.out.println(t.endsWith("ile"));
    }
}
