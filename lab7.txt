// Single Inheritance Example
class Vehicle {
    void start() {
        System.out.println("Vehicle can start");
    }
}

class Car extends Vehicle { // Single Inheritance
    void drive() {
        System.out.println("Car can be driven");
    }
}

// Multilevel Inheritance Example
class ElectricCar extends Car { // Multilevel: Vehicle -> Car -> ElectricCar
    void charge() {
        System.out.println("Electric Car can be charged");
    }
}

// Hierarchical Inheritance Example
class Bike extends Vehicle { // Another child of Vehicle
    void ride() {
        System.out.println("Bike can be ridden");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("---- Single Inheritance ----");
        Car c = new Car();
        c.start(); // from Vehicle
        c.drive(); // from Car

        System.out.println("\n---- Multilevel Inheritance ----");
        ElectricCar ec = new ElectricCar();
        ec.start(); // from Vehicle
        ec.drive(); // from Car
        ec.charge(); // from ElectricCar

        System.out.println("\n---- Hierarchical Inheritance ----");
        Bike b = new Bike();
        b.start(); // from Vehicle
        b.ride(); // from Bike
    }
}
