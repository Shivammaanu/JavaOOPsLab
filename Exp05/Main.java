// Fruit class to represent fruit details
class Fruit {
    String name;           // Fruit ka naam
    int price;             // Fruit ka price
    String bunchOrSingle; // Fruit ka type: Bunch ya Single

    // Constructor to initialize the fruit object
    Fruit(String name, int price, String bunchOrSingle) {
        this.name = name;
        this.price = price;
        this.bunchOrSingle = bunchOrSingle;
    }

    // Method to display fruit details
    void displayFruit() {
        System.out.println("Fruit: " + this.name);
        System.out.println("Bunch/Single: " + this.bunchOrSingle);
        System.out.println("Price: " + this.price);
        System.out.println(); // Extra line for better readability
    }
}

public class Main {
    public static void main(String[] args) {
        // Fruit objects create karna
        Fruit apple = new Fruit("Apple", 180, "bunch");
        Fruit mango = new Fruit("Mango", 150, "bunch");

        // Fruits ke details display karna
        apple.displayFruit();
        mango.displayFruit();
    }
}
