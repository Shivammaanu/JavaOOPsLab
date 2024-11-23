import java.util.*;

class Driving {
    int milesPerDay; 
    int costPerGallon;
    int avgFees;  //(jo additional cost ho sakti hai)
    int tollsPerDay; 

    // Constructor for initializing the data
    Driving(int milesPerDay, int costPerGallon, int avgFees, int tollsPerDay) {
        this.avgFees = avgFees;
        this.milesPerDay = milesPerDay;
        this.tollsPerDay = tollsPerDay;
        this.costPerGallon = costPerGallon;
    }

  
    int drivingCostPerDay() {
        // Total cost: tolls + (miles driven per day * cost per gallon) + average fees
        return this.tollsPerDay + this.milesPerDay * this.costPerGallon + this.avgFees;
    }
}

public class DailyDrivingCost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the total miles driven per day: ");
        int milesPerDay = sc.nextInt(); 

        System.out.print("Enter the cost per gallon of gasoline: ");
        int costPerGallon = sc.nextInt(); 
        
        System.out.print("Average fees per day: ");
        int avgFees = sc.nextInt();  
        
        System.out.print("Enter the tolls per day: ");
        int tollsPerDay = sc.nextInt();  
        

        Driving drive = new Driving(milesPerDay, costPerGallon, avgFees, tollsPerDay);

       
        System.out.println("The cost per day of driving to work: " + drive.drivingCostPerDay());
        
        sc.close();
    }
}
