package Oops;
public class LoanApp {
    // static variable
    static float rateOfInterest = 9.5f;
}
class TestsApp {
    public static void main(String[] args) {
        // Accessing static variable using ClassName
        System.out.println("Rate of Interest: " + LoanApp.rateOfInterest);
    }
}


