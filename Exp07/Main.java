// VehicleEntity ek abstract class hai jo sabhi vehicle entities ke liye common functions define karti hai
abstract class VehicleEntity {

    // Debugging info display karne wala method, jo object ke naam ko print karta hai
    public void debugInfo() {
        System.out.println("Debugging info for: " + this.getClass().getSimpleName());
    }

    // performFunction method jo har subclass me alag alag implement hoga
    public abstract void performFunction();
}

// Car class jo VehicleEntity se inherit hoti hai
class Car extends VehicleEntity {
    private String fuelType;

    // Car ka constructor jo fuel type ko set karta hai
    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    // performFunction method ko override karte hain taaki car ka function show ho
    @Override
    public void performFunction() {
        System.out.println("Driving the car with fuel type: " + fuelType + ".");
    }
}

// Truck class jo VehicleEntity se inherit hoti hai
class Truck extends VehicleEntity {
    private String cargoType;

    // Truck ka constructor jo cargo type ko set karta hai
    public Truck(String cargoType) {
        this.cargoType = cargoType;
    }

    // performFunction method ko override karte hain taaki truck ka function show ho
    @Override
    public void performFunction() {
        System.out.println("Transporting cargo of type: " + cargoType + ".");
    }
}

// Motorcycle class jo VehicleEntity se inherit hoti hai
class Motorcycle extends VehicleEntity {
    private boolean isSportBike;

    // Motorcycle ka constructor jo isSportBike ko set karta hai
    public Motorcycle(boolean isSportBike) {
        this.isSportBike = isSportBike;
    }

    // performFunction method ko override karte hain taaki motorcycle ka function show ho
    @Override
    public void performFunction() {
        System.out.println("Riding the motorcycle. Sportbike: " + (isSportBike ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        // Car, Truck aur Motorcycle ke objects create kar rahe hain
        VehicleEntity car = new Car("Petrol");
        VehicleEntity truck = new Truck("Furniture");
        VehicleEntity motorcycle = new Motorcycle(true);

        // Vehicle Production Debugging Information print kar rahe hain
        System.out.println("Vehicle Debugging Information:");
        
        // Car ka debugging info aur function display kar rahe hain
        car.debugInfo();
        car.performFunction();

        // Truck ka debugging info aur function display kar rahe hain
        truck.debugInfo();
        truck.performFunction();

        // Motorcycle ka debugging info aur function display kar rahe hain
        motorcycle.debugInfo();
        motorcycle.performFunction();
    }
}
