package Encapsulation;
// Demo class (defined normally, not inside another class)
class Demo {
    static int a;  // static variable (shared by all objects)
    int b;         // non-static variable (per object)
    void disp() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
// Main class (file name should be StaticKeywordConcept.java)
public class StaticKeywordConcept {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        Demo.a = 45; // static: updated via class name
        d1.b = 25;   // non-static: specific to d1
        d2.a = 65;   // static: update reflected in all instances
        System.out.println(Demo.a); 
        System.out.println(d1.a);
        System.out.println(d2.a);  
        System.out.println(d3.a);  
        System.out.println(d1.b);  
        System.out.println(d2.b); 
        System.out.println(d3.b);  
    }
}
