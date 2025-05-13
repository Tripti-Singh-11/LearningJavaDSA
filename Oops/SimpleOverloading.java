package Oops;
public class SimpleOverloading {
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
class Test {
    public static void main(String[] args) {
        SimpleOverloading c = new SimpleOverloading(); 
        c.add(10, 20);          
        c.add(10.5f, 20.5f);   
        c.add(10.0, 20.0);      
    }
}



