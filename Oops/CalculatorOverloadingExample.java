package Oops;
// CalculatorOverloadingExample class ke andar 3 overloaded add() methods hain
public class CalculatorOverloadingExample {
    public void add(int a, int b) {
        System.out.println("int-int argument");
    }
    public void add(float a, float b) {
        System.out.println("float-float argument");
    }
    public void add(double a, double b) {
        System.out.println("double-double argument");
    }
}
// Test class jisme main() method likha gaya hai
class Test {
    public static void main(String[] args) {
        CalculatorOverloadingExample c = new CalculatorOverloadingExample();
        c.add(10, 20); // int, int
    }
}

