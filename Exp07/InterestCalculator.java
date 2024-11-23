import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Principal amount : ");
        double principalAmount = sc.nextDouble();

        
        System.out.print("Enter Annual interest rate (in %): ");
        double annualInterestRate = sc.nextDouble();

        
        System.out.print("Enter the amount of month till you Invest: ");
        int months = sc.nextInt();

        // Annual interest rate ko decimal mein convert kar rahe hain
        double rate = annualInterestRate / 100;

        // Total interest calculate karte hain (months ko years mein convert kar rahe hain)
        double years = months / 12.0;  
        double totalInterest = principalAmount * rate * years;

        
        double finalBalance = principalAmount + totalInterest;

       
        System.out.printf("\nTotal interest: %.2f\n", totalInterest);  
        System.out.printf("Final balance: %.2f\n", finalBalance);  

        sc.close();
    }
}
