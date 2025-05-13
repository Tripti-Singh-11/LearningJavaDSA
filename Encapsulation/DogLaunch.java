package Encapsulation;

public class DogLaunch {
    class Dog extends Object {  
        private String breed;
        private float age;
        private int price;
        public Dog(String breed, float age, int price) {
            super();  
            this.breed = breed;
            this.age = age;
            this.price = price;
        }
        public Dog() {
            super(); 
            breed = "BullDog";
            age = 8.5f;
            price = 6500;
        }
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
    public static void main(String[] args) {
        DogLaunch dogLaunch = new DogLaunch(); 
        Dog d1 = dogLaunch.new Dog("Pug", 4.5f, 4500); 
        System.out.println(d1.getBreed()); 
        System.out.println(d1.getAge());  
        System.out.println(d1.getPrice()); 
        Dog d2 = dogLaunch.new Dog(); 
        System.out.println(d2.getBreed()); 
        System.out.println(d2.getAge());   
        System.out.println(d2.getPrice()); 
    }
}
