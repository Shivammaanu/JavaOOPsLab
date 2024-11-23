import java.util.*;

class GasMileage {
    int milesDriven[];  
    int gallonsUsed[]; 
    float milesPerGallon;  
    float eachAvg[];

    // Constructor: Miles driven and gallons used ko initialize karte hain
    GasMileage(int milesDriven[], int gallonsUsed[]) {
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
        this.eachAvg = new float[this.gallonsUsed.length];  // Array for individual trip averages
    }

    // Total average miles per gallon calculate karte hain
    void totalAverage() {
        int totalMiles = 0;  
        int totalGallons = 0; 

        // Miles ko add kar rahe hain total miles me
        for (int i = 0; i < this.milesDriven.length; i++) {
            totalMiles += milesDriven[i];
        }

        // Gallons ko add kar rahe hain total gallons me
        for (int i = 0; i < this.gallonsUsed.length; i++) {
            totalGallons += gallonsUsed[i];
        }

        // Total average miles per gallon calculate kar rahe hain
        this.milesPerGallon = (float) totalMiles / totalGallons;
    }

    // Har trip ke liye average miles per gallon calculate karte hain
    void eachAvergaeTotal() {
        for (int i = 0; i < this.eachAvg.length; i++) {
            this.eachAvg[i] = (float) this.milesDriven[i] / this.gallonsUsed[i];
        }
    }

    // Total average miles per gallon ko display karte hain
    void displayAverage() {
        System.out.println("Total average miles per gallon: " + this.milesPerGallon);
    }

    // Har trip ke liye average miles per gallon ko display karte hain
    void displayEach() {
        System.out.println("Displaying Average Miles Per Gallon for each trip: ");
        System.out.print("[");
        for (int i = 0; i < this.eachAvg.length; i++) {
            System.out.print(this.eachAvg[i] + " ");
        }
        System.out.println("]");
    }
}

public class Mileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of trips: ");
        int n = sc.nextInt();

        
        int milesDriven[] = new int[n];
        int gallonsUsed[] = new int[n];

      
        System.out.println("Enter miles driven in each trip: ");
        for (int i = 0; i < milesDriven.length; i++) {
            System.out.print("For Trip " + (i + 1) + ": ");
            milesDriven[i] = sc.nextInt();
        }

        
        System.out.println("Enter gallons used for each trip: ");
        for (int i = 0; i < gallonsUsed.length; i++) {
            System.out.print("For Trip " + (i + 1) + ": ");
            gallonsUsed[i] = sc.nextInt();
        }

        GasMileage vehicle = new GasMileage(milesDriven, gallonsUsed);

        // Total aur individual trip averages calculate karte hain
        vehicle.totalAverage();
        vehicle.eachAvergaeTotal();

        
        vehicle.displayAverage();
        vehicle.displayEach();

        sc.close();
    }
}
