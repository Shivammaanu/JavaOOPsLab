import java.util.Scanner;

public class ParkingGarage {

    // Parking charge calculate karne wali method
    public static double calculateParkingCharge(double parkedHours) {
        double charge;

        // Agar parking 3 hours tak hai, toh fixed charge hai
        if (parkedHours <= 3) {
            charge = 2.00;
        }
        else {
            // Agar 3 hours se zyada time hai, toh extra hours ka charge calculate karte hain
            double extraHours = Math.ceil(parkedHours - 3);
            charge = 2.00 + (extraHours * 0.50);  // Extra hours ke liye charge 0.50 per hour
            
            // Agar total charge 10 se zyada ho gaya toh maximum charge 10 hi rahega
            if (charge > 10.00) {
                charge = 10.00;
            }
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalIncome = 0.0; 
        String continueParking = "";  // User se puchenge agar next customer ka data dena hai
        
        do {
            
            System.out.print("Enter the number of hours parked: ");
            double parkedHours = sc.nextDouble();
            
            // Agar user ne negative value di, toh error show karenge
            if (parkedHours < 0) {
                System.out.println("Invalid hours. Please enter a positive value.");
                continue;
            }

            
            double parkingCharge = calculateParkingCharge(parkedHours);
            
            
            System.out.println("Parking charge for this customer: $" + parkingCharge);
            
            // Total income mein current charge add karte hain
            totalIncome += parkingCharge;
            
            // User se puchhna ki kya woh next customer ka data dena chahte hain
            System.out.print("Do you want to enter another customer? (yes/no): ");
            continueParking = sc.next();
            
        } while (continueParking.equalsIgnoreCase("yes"));  
        
        // Total income display karte hain
        System.out.println("\nTotal receipts for yesterday: $" + totalIncome);
        
        sc.close(); 
    }
}
