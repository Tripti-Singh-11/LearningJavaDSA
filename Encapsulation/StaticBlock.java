package Encapsulation;
public class StaticBlock {
    static int a = 5;
    static {
    a = 45;
    System.out.println("Inside static block");
    }
    public static void main(String[] args) {
    System.out.println("Inside main() method");
    System.out.println("Value of a: " + a);
    }
}



