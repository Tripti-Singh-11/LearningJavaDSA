package ObjectCreation;
class Dog {
    String breed;
    float age;
    int price;
    // Static variable to count Dog objects
    static int objectCount = 0;
    // Constructor
    Dog() {
        breed = "Pug";
        age = 4.5f;
        price = 5500;
        objectCount++; // Count increment
    }
}
public class ObjectCounter {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        System.out.println("Total Dog objects created = " + Dog.objectCount);
    }
}