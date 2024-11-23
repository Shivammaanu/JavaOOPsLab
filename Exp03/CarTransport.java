// Abstract class Car (Base class for all cars)
abstract class Car {
    String brandName; // Car brand ka naam

    // Constructor to initialize brand name
    Car(String brandName) {
        this.brandName = brandName;
    }

    // Car brand display karne ka method
    void displayBrand() {
        System.out.println("Brand: " + this.brandName);
    }

    // Abstract methods - subclass me implement karna hoga
    abstract void displayMileage(); // Mileage show karega
    abstract void displayModel();   // Model ka naam show karega
}

// Maruti car ke liye subclass
class Maruti extends Car {
    int mileage;       // Mileage in km/hr
    String modelName;  // Model ka naam

    // Constructor for Maruti
    Maruti(int mileage, String modelName) {
        super("Maruti"); // Brand ko parent constructor ke through set karte hain
        this.mileage = mileage;
        this.modelName = modelName;
    }

    // Mileage display karega
    void displayMileage() {
        System.out.println("This Maruti car gives an average of " + this.mileage + " km/hr");
    }

    // Model name display karega
    void displayModel() {
        System.out.println("Model: " + this.modelName);
    }
}

// Santro car ke liye subclass
class Santro extends Car {
    int mileage;       // Mileage in km/hr
    String modelName;  // Model ka naam

    // Constructor for Santro
    Santro(int mileage, String modelName) {
        super("Santro"); // Brand ko parent constructor ke through set karte hain
        this.mileage = mileage;
        this.modelName = modelName;
    }

    // Mileage display karega
    void displayMileage() {
        System.out.println("This Santro car gives an average of " + this.mileage + " km/hr");
    }

    // Model name display karega
    void displayModel() {
        System.out.println("Model: " + this.modelName);
    }
}

// Main class
public class CarTransport {
    public static void main(String[] args) {
        // Maruti car ka object banate hain
        Car marutiCar = new Maruti(35, "800");
        marutiCar.displayBrand(); 
        marutiCar.displayModel(); 
        marutiCar.displayMileage(); 

        // Santro car ka object banate hain
        Car santroCar = new Santro(30, "100");
        santroCar.displayBrand(); 
        santroCar.displayModel(); 
        santroCar.displayMileage(); 
    }
}
