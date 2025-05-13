package Oops;
public class OverloadingAmbiguity {
    public void methodOne(String s) {
        System.out.println("String version...");
    }
    public void methodOne(StringBuffer sb) {
        System.out.println("StringBuffer version...");
    }
    public void methodOne(Object o) {
        System.out.println("Object version...");
    }
}
class samples {
    public static void main(String[] args) {
        OverloadingAmbiguity s = new OverloadingAmbiguity();
        s.methodOne(new String("Sachin"));          // Calls methodOne(String s)
        s.methodOne(new StringBuffer("Sachin"));    // Calls methodOne(StringBuffer sb)
        // To fix the ambiguity, we should explicitly cast null
        s.methodOne((String) null);                 // Cast to String => methodOne(String s)
        s.methodOne((StringBuffer) null);        // Cast to StringBuffer => methodOne(StringBuffer sb)
        s.methodOne((Object) null);              // Cast to Object => methodOne(Object o)
    }
}
