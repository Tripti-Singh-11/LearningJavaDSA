package Oops;
    class Calculator {
        // Instance variable
        int a = 10;
        int b = 20;
        public int add() {
            int result = a + b;  // Local variable
            return result;
        }
    }
    class TestApps {
        public static void main(String[] args) {
            Calculator c = new Calculator(); // Object in Heap
            int sum = c.add();               // Local variable in stack
            System.out.println(sum);     
        }
}
