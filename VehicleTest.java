abstract class Vehicle {
    abstract void start(); // Abstract method

    void fuel() {
        System.out.println("All vehicles need fuel.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or button.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.fuel();

        v2.start();
        v2.fuel();
    }
}
