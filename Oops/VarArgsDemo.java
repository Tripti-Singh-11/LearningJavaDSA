package Oops;
class AdvancedCalculator {
    // Var-Args: method that accepts 0 or more integers
    public void add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum is: " + sum);
    }
}
public class VarArgsDemo {
    public static void main(String[] args) {
        AdvancedCalculator acalc = new AdvancedCalculator();
        acalc.add();                              // No arguments
        acalc.add(10);                 // One argument
        acalc.add(10, 20, 30);         // Three arguments
        acalc.add(5, 10, 15, 20, 25);  // Five arguments
    }
}




