package Encapsulation;
public class ConstructorChainingDemo {
    static class Dog extends Object {
        private String breed;
        private float age;
        private int price;
        // Parameterized Constructor
        public Dog(String breed, float age, int price) {
            this(); // Call to current class's default constructor
            this.breed = breed;
            this.age = age;
            this.price = price;
        }
        // Default Constructor
        public Dog() {
            super(); // Call to Object class constructor
            breed = "Pug";
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
    public static class Launch {
        public static void main(String[] args) {
            Dog d1 = new Dog("BullDog", 6.5f, 9988);
            System.out.println(d1.getBreed());  // Output: BullDog
            System.out.println(d1.getAge());    // Output: 6.5
            System.out.println(d1.getPrice());  // Output: 9988
            System.out.println();
            Dog d2 = new Dog();
            System.out.println(d2.getBreed());  // Output: Pug
            System.out.println(d2.getAge());    // Output: 4.5
            System.out.println(d2.getPrice());  // Output: 4455
        }
    }
}
