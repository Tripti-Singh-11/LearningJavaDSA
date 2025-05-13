package Encapsulation;
public class DogExtendObject {
    private String breed;
    private float age;
    private int price;
    public DogExtendObject(String breed, float age, int price) {
        super(); 
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
        DogExtendObject d = new DogExtendObject("Pug", 4.5f, 4500);
        System.out.println(d.getBreed());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());
    }
}