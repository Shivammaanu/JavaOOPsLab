import java.util.*;

class Bill {
    String itemDescription; 
    String itemCode;  
    int itemQuantity;  
    double unitPrice; 

    // Constructor to initialize the bill details
    Bill(int itemQuantity, double unitPrice, String itemDescription, String itemCode) {
        this.itemDescription = itemDescription;
        this.itemCode = itemCode;
        
        // Agar price negative ho toh usse 0 set karte hain
        if (unitPrice < 0) {
            this.unitPrice = 0;
        } else {
            this.unitPrice = unitPrice;
        }
        
        this.itemQuantity = itemQuantity;
    }

    // Setters: Yeh methods item details ko update karne ke liye hain
    void setItemQuantity(int qty) {
        this.itemQuantity = qty;
    }

    void setUnitPrice(double price) {
        this.unitPrice = price;
    }

    void setItemDescription(String description) {
        this.itemDescription = description;
    }

    void setItemCode(String code) {
        this.itemCode = code;
    }

    // Getters: Yeh methods item details ko retrieve karne ke liye hain
    int getItemQuantity() {
        return this.itemQuantity;
    }

    double getUnitPrice() {
        return this.unitPrice;
    }

    String getItemDescription() {
        return this.itemDescription;
    }

    String getItemCode() {
        return this.itemCode;
    }

    // Method to calculate total bill amount
    double calculateTotalAmount() {
        return this.unitPrice * this.itemQuantity;  // Price per item * Quantity
    }
}

public class InvoiceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the item description: ");
        String itemDesc = scanner.nextLine();  

        System.out.print("Enter the item code: ");
        String itemCode = scanner.nextLine();  

        System.out.print("Enter the item quantity: ");
        int itemQuantity = scanner.nextInt(); 

        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();  
        
        Bill bill = new Bill(itemQuantity, unitPrice, itemDesc, itemCode);
        
        System.out.println();
        System.out.println(".............BILL DETAILS...........");
        
        System.out.println("Item Description:    " + bill.getItemDescription());
        System.out.println("Item Code:           " + bill.getItemCode());
        System.out.println("Item Quantity:       " + bill.getItemQuantity());
        System.out.println("Unit Price:          " + bill.getUnitPrice());
        System.out.println("Total Amount:        " + bill.calculateTotalAmount()); 
        scanner.close();  
    }
}
