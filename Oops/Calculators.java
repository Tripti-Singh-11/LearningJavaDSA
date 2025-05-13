package Oops;
public class Calculators {
    public void add(int a, int b) {
        System.out.println("int-int argument");
    }
    public void add(float a, float b) {
        System.out.println("float-float argument");
    }
    public void add(double a, double b) {
        System.out.println("double-double argument");
    }
    public void add(int a, float b) {
        System.out.println("int-float argument");
    }
    public void add(float a, int b) {
        System.out.println("float-int argument");
    }
}
class Tests {
    public static void main(String[] args) {
        Calculators c = new Calculators();
        c.add(10, 20);       
        c.add(10.5f, 20.5f);
        c.add(10.5, 20.5);   
        c.add(10, 20.5f);    
        c.add(10.5f, 20);    
    }
}
