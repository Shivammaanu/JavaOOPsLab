class Vehicle {
    String model;
    String color;

    // Vehicle class ka constructor, jo model aur color set karta hai
    Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Max speed ka method, jo by default vehicle ke liye unknown hai
    void maxSpeed() {
        System.out.println("Max speed of this vehicle is not known!");
    }
}

class Car extends Vehicle {
    int horsePower;
    int maxSpeed;

    // Car class ka constructor, jo super class ke constructor ko call karta hai
    Car(String model, String color, int horsePower, int maxSpeed) {
        super(model, color);
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    // Car ke liye maxSpeed method override kiya gaya hai
    void maxSpeed() {
        System.out.println("The maximum speed of this car is " + maxSpeed + " km/hr");
    }
}

class Bicycle extends Vehicle {
    int gearCount;
    int maxSpeed;

    // Bicycle class ka constructor
    Bicycle(String model, String color, int gearCount, int maxSpeed) {
        super(model, color);
        this.gearCount = gearCount;
        this.maxSpeed = maxSpeed;
    }

    // Bicycle ke liye maxSpeed method override kiya gaya hai
    void maxSpeed() {
        System.out.println("The maximum speed of this bicycle is " + maxSpeed + " km/hr");
    }
}

class Scooter extends Vehicle {
    boolean hasCarrier;
    int maxSpeed;

    // Scooter class ka constructor
    public Scooter(String model, String color, boolean hasCarrier, int maxSpeed) {
        super(model, color);
        this.hasCarrier = hasCarrier;
        this.maxSpeed = maxSpeed;
    }

    // Scooter ke liye maxSpeed method override kiya gaya hai
    public void maxSpeed() {
        System.out.println("The maximum speed of the scooter is 90 km/h.");
    }
}

public class Transport {
    public static void main(String[] args) {
        // Vehicles create karna: Car, Bicycle, aur Scooter ke objects
        Vehicle car = new Car("Sedan", "Red", 150, 120);
        Vehicle bicycle = new Bicycle("Mountain Bike", "Blue", 18, 14);
        Vehicle scooter = new Scooter("Vespa", "Black", true, 50);

        // Car ka speed display karna
        System.out.println("Car:");
        car.maxSpeed();

        // Bicycle ka speed display karna
        System.out.println("\nBicycle:");
        bicycle.maxSpeed();

        // Scooter ka speed display karna
        System.out.println("\nScooter:");
        scooter.maxSpeed();
    }
}
