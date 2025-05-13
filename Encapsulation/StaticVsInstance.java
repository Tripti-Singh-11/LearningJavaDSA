package Encapsulation;
class Car {
    int EngineNo;
    int distanceTravelled;
    // Static method: Can be called using class name directly
    static void milesToKms() {
        Car c = new Car();
        c.EngineNo = 101;
        c.distanceTravelled = 100;
        System.out.println("Miles to KMs: " + (c.distanceTravelled * 1.6));
    }
    // Instance method: Needs object to call
    void mileage() {
        distanceTravelled = 200;
        System.out.println("Distance Travelled: " + distanceTravelled);
    }
}
public class StaticVsInstance {
    public static void main(String[] args) {
        Car.milesToKms(); // static method call
        Car maruti800 = new Car(); // instance method call
        maruti800.mileage();
        Car innova = new Car(); // another instance
        innova.mileage();
    }
}

