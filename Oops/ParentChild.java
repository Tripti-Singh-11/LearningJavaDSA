package Oops;
public class ParentChild {
    public void property(){
    System.out.println("Land+Cash+Gold");
    }
    public void marry(){
    System.out.println("RelativeGirl");
    }
    }
    class Child extends ParentChild
    {
    //Overriding
    public void marry(){
    //Re-Implementation
    System.out.println("SomeOther Girl...");
    }
    }
    class Test2 {
    public static void main(String[] args) {
    //ParentChild Object
    ParentChild p1 = new ParentChild();
    p1.property();
    p1.marry();
    System.out.println();
    //Child Object
    Child c1 = new Child();
    c1.property();
    c1.marry();
    System.out.println();
    //Child Object
    ParentChild p2=new Child();
    p2.property();
    p2.marry();
    }
    }

