package Oops;
public class CalculatorTypePromotionExample {
    public void add(int a, float b) {
        System.out.println("int-float argument");
    }
    public void add(float a, int b) {
        System.out.println("float-int argument");
    }
}
class TestCalculator {
    public static void main(String[] args) {
        CalculatorTypePromotionExample c = new CalculatorTypePromotionExample();
        c.add(10, 20.0f); // Now clear - (int, float)
    }
}



