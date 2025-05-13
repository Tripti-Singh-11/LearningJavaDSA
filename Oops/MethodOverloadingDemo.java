package Oops;
class Calculators1 {
    // Method Overloading: same method name, different parameters
    public void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }
    public void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
    public void add(double a, double b) {
        System.out.println("Sum of 2 double numbers: " + (a + b));
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculators calc = new Calculators();
        calc.add(10, 20);          // calls method with (int, int)
        calc.add(10, 20, 30);       // calls method with (int, int, int)
        calc.add(10.5, 20.5);       // calls method with (double, double)
    }
}
