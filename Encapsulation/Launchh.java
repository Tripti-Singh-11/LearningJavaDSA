package Encapsulation;
class Dog {
    private String breed;
    private float age;
    private int price;

    public Dog(String breed, float age, int price) {
        this.breed = breed;
        this.age = age;
        this.price = price;
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

class Launch {
    public static void main(String[] args) {
       
        Dog d1 = new Dog("Pug", 4.5f, 4500);
        System.out.println(d1.getBreed()); // Pug
        System.out.println(d1.getAge());   // 4.5
        System.out.println(d1.getPrice()); // 4500

       
        Dog d2 = new Dog();  
        System.out.println(d2.getBreed());
        System.out.println(d2.getAge());
        System.out.println(d2.getPrice());
    }
}
