package Oops;
class Students {
    // Instance variables
    String name;
    int age;
     // Constructor
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Instance method
    public void disp() {
        System.out.println("Name is :: " + name);
        System.out.println("Age is :: " + age);
    }
}
public class StudentsDetails { // Ensure this class name matches the file name
    public static void main(String[] args) {
        // Creating instances of Student
        Students std1 = new Students("Sachin", 51);
        std1.disp();
        Students std2 = new Students("Kohli", 37);
        std2.disp();
    }
}

