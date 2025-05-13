package ObjectCreation;
public class Demoo {
        // Static Blocks
        static {
            System.out.println("1st static block");
            System.out.println();
        }
        static {
            System.out.println("2nd static block");
            System.out.println();
        }
        static {
            System.out.println("3rd static block");
            System.out.println();
        }
        // Instance Blocks
        {
            System.out.println("1st instance block");
            System.out.println();
        }
        {
            System.out.println("2nd instance block");
            System.out.println();
        }
        {
            System.out.println("3rd instance block");
            System.out.println();
        }
        // Constructor
        Demoo() {
            System.out.println("Inside constructor");
            System.out.println();
        }
        public static void main(String[] args) {
            System.out.println("Inside main");
            System.out.println();
            Demoo d1 = new Demoo();
            Demoo d2 = new Demoo();
        }
    }
    

