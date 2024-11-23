import java.util.*;

// Product class jisme basic product details store hoti hai
class Product {
    int productId;      // Product ka ID
    String name;        // Product ka naam
    int categoryId;     // Product ka category ID
    int unitPrice;      // Product ka price per unit

    // Constructor jisme product ke details initialize kiye jaate hain
    Product(int productId, String name, int categoryId, int unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }
}

// ElectricalProduct class jo Product ko extend karta hai aur electrical specific attributes ko add karta hai
class ElectricalProduct extends Product {
    int voltageRange;   // Electrical product ka voltage range
    int wattage;        // Electrical product ka wattage

    // Constructor jisme basic product details aur electrical product specific details initialize kiye jaate hain
    ElectricalProduct(int productId, String name, int categoryId, int unitPrice, int voltageRange, int wattage) {
        super(productId, name, categoryId, unitPrice);  // Parent constructor call karke basic details set karte hain
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    // Method to update wattage
    void updateWattage(int wattage) {
        this.wattage = wattage;
        System.out.println("Wattage ko update karke: " + this.wattage + " kar diya gaya hai");
    }

    // Method to update voltage range
    void updateVoltageRange(int voltageRange) {
        this.voltageRange = voltageRange;
        System.out.println("New Updated Voltage Range is : " + this.voltageRange);
    }

    // Method to update price
    void updatePrice(int newPrice) {
        this.unitPrice = newPrice;
        System.out.println("New Updated Price : " + this.unitPrice);
    }

    // Method to display electrical product details
    void displayDetails() {
        System.out.println("Electrical Product Details: ");
        System.out.println("Product Name: " + this.name);
        System.out.println("Product ID: " + this.productId);
        System.out.println("Category ID: " + this.categoryId);
        System.out.println("Unit Price: " + this.unitPrice);
        System.out.println("Voltage Range: " + this.voltageRange);
        System.out.println("Wattage: " + this.wattage);
    }
}

public class Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se product details lene ka process
        System.out.print("Enter the product name: ");
        String name = sc.nextLine();  // Product ka naam input karna
        System.out.print("Enter the product id: ");
        int id = sc.nextInt();  // Product ka ID input karna
        System.out.print("Enter the unit price: ");
        int unit = sc.nextInt();  // Unit price input karna
        System.out.print("Enter the wattage: ");
        int watt = sc.nextInt();  // Wattage input karna
        System.out.print("Enter the voltage range: ");
        int voltage = sc.nextInt();  // Voltage range input karna
        System.out.print("Enter the category id: ");
        int cat = sc.nextInt();  // Category ID input karna
        System.out.println();

        // ElectricalProduct ka object banate hain aur uski details dikhate hain
        ElectricalProduct fan = new ElectricalProduct(id, name, cat, unit, voltage, watt);
        fan.displayDetails();  // Method call karke electrical product ki details dikhate hain

        // Wattage aur price ko update karte hain
        System.out.print("\nEnter new wattage: ");
        int newWattage = sc.nextInt();
        fan.updateWattage(newWattage);  // Wattage ko update karna

        System.out.print("Enter new price: ");
        int newPrice = sc.nextInt();
        fan.updatePrice(newPrice);  // Price ko update karna

        // Updated product details dikhate hain
        System.out.println("\nUpdated Product Details:");
        fan.displayDetails();  // Method call karke updated details dikhate hain
    }
}
