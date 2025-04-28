package basics.Assignment;

public class IncreDecreModulus {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Original Value:"+x);
        System.out.println("After Increment:"+(++x));
        System.out.println("After Decrement:"+(--x));
        int y = 9;
        System.out.println("Modulus:"+(x%y));
    }
}
