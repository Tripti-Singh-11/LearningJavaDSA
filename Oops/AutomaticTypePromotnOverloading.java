package Oops;

public class AutomaticTypePromotnOverloading {
    public void add(int a) {
        System.out.println("int argument");
    }

    public void add(float a) {
        System.out.println("float argument");
    }
}
class Test {
    public static void main(String[] args) {
        AutomaticTypePromotnOverloading c = new AutomaticTypePromotnOverloading();
        c.add('a');     // char → int
        c.add(19L);     // long → float
    }
}


