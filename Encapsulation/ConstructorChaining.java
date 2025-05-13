package Encapsulation;
public class ConstructorChaining {
static class Dog extends Object {
        private String breed;
        private float age;
        private int price;
        // Constructor with 3 parameters
        public Dog(String breed, float age, int price) {
            this(breed); // Calls constructor with 1 parameter
        }
        // Constructor with 1 parameter
        public Dog(String breed) {
            this(); // Calls default constructor
            this.breed = breed;
        }
        // Default constructor
        public Dog() {
            super(); // Calls Object class constructor
            age = 4.5f;
            price = 4455;
        }
        // Getters
        public String getBreed() {
            return breed;
        }
        public float getAge() {
            return age;
        }
        public int getPrice() {
            return price;
        }
    }
    //  'main' method in outer public class 
    public static void main(String[] args) {
        Dog d1 = new Dog("BullDog", 6.5f, 9988);
        System.out.println(d1.getBreed());  // BullDog
        System.out.println(d1.getAge());    // 4.5
        System.out.println(d1.getPrice());  // 4455
        System.out.println();
        Dog d2 = new Dog();
        System.out.println(d2.getBreed());  // null
        System.out.println(d2.getAge());    // 4.5
        System.out.println(d2.getPrice());  // 4455
    }
}
