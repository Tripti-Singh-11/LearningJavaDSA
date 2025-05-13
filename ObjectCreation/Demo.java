package ObjectCreation;
public class Demo {
    int a, b;
    {
        System.out.println("Inside non-static block");
    }
    Demo() {
        super();
        System.out.println("Inside Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Inside main() method");
        Demo d = new Demo();
    }
}


