import java.util.Scanner;

public class MovieTheater {
    
    // Method to calculate total profit
    public static double calculateTotalProfit(int attendees) {
        double ticketPrice = 5.0; 
        double fixedCost = 20.0;
        double costPerAttendee = 0.50; 
        
        
        double totalIncome = ticketPrice * attendees;
        
       
        double totalCost = fixedCost + (costPerAttendee * attendees);
        
   
        double totalProfit = totalIncome - totalCost;
        
        return totalProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number of attendees: ");
        int attendees = sc.nextInt();
        
       
        double profit = calculateTotalProfit(attendees);
        
        
        System.out.printf("Total profit from the show: $%.2f\n", profit);
        
        sc.close();
    }
}
