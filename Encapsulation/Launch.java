package Encapsulation;
class Dog {
    private String breed;
    private float age;
    private int price;
    public void setBreed(String x) {
        breed = x;
    }
    public void setAge(float y) {
        age = y;
    }
    public void setPrice(int z) {
        price = z;
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
public class Launch {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setBreed("Pug");
        d.setAge(4.5f);
        d.setPrice(7500);
        System.out.println(d.getBreed());  
        System.out.println(d.getAge());    
        System.out.println(d.getPrice());  
    }
}


