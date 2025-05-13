package Encapsulation;
public class ClassLoading {
static class Demo {
    static {
        System.out.println("Inside static block of Demo");
    }
}
public static void main(String[] args) {
        System.out.println("Inside main() method");
        Demo d = new Demo(); // static block runs when class Demo is loaded
    }
}


