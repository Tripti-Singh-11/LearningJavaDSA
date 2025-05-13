package Oops;
public class OverloadingReference {
    public void methodOne(String s) {
        System.out.println("String version...");
    }

    public void methodOne(Object o) {
        System.out.println("Object version...");
    }
}
 class sample {
    public static void main(String[] args) {
        OverloadingReference s = new OverloadingReference();
        s.methodOne("Sachin");         
        s.methodOne(new Object());         
        s.methodOne(null);                 
    }
}

