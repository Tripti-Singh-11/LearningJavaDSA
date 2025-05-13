package Encapsulation;
public class ExtendObject {
    // Dog class defined inside ExtendObject.java file
    static class Dog {
        private String breed;
        private float age;
        private int price;
        //  Default Constructor
        public Dog() {
            super(); // Object class ka constructor implicitly call hota hai
            this.breed = "BullDog";
            this.age = 8.5f;
            this.price = 6500;
        }
         //  Parameterized Constructor
        public Dog(String breed, float age, int price) {
            super();
            this.breed = breed;
            this.age = age;
            this.price = price;
        }

        //  Getters
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

    //  Main method defined properly in ExtendObject
    public static void main(String[] args) {
        //  Using parameterized constructor
        Dog d1 = new Dog("Pug", 4.5f, 4500);
        System.out.println(d1.getBreed()); // Pug
        System.out.println(d1.getAge());   // 4.5
        System.out.println(d1.getPrice()); // 4500

        // ✅ Using default constructor
        Dog d2 = new Dog();
        System.out.println(d2.getBreed()); // BullDog
        System.out.println(d2.getAge());   // 8.5
        System.out.println(d2.getPrice()); // 6500
    }
}
