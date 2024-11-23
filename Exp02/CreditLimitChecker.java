import java.util.Scanner;

class Customer {
    private int accountNo;  
    private double initialBalance; 
    private double debits;  
    private double credits;  
    private double creditLimit;  
    private double currentBalance;

    // Constructor to initialize customer details
    public Customer(int accountNo, double initialBalance, double creditLimit) {
        this.accountNo = accountNo;
        this.initialBalance = initialBalance;
        this.creditLimit = creditLimit;
    }

    // Method to calculate net balance after debits and credits
    public void calculateBalance() {
        currentBalance = initialBalance - debits - credits;  // Net balance nikalna
    }

    
    public boolean isCreditLimitExceeded() {
        return currentBalance < creditLimit;  // Agar net balance credit limit se kam ho, to limit exceed ho gaya
    }

    // Getter methods for account number and current balance
    public int getAccountNo() {
        return accountNo;  
    }

    public double getCurrentBalance() {
        return currentBalance; 
    }

    // Setter methods for debits and credits
    public void setDebits(double debits) {
        this.debits = debits;  // Debits ko set karte hain
    }

    public void setCredits(double credits) {
        this.credits = credits;  // Credits ko set karte hain
    }
}

class CreditLimitValidator {
    // Method to check and validate if credit limit is exceeded
    public static void validateCreditLimit(Customer customer) {
        if (customer.isCreditLimitExceeded()) {
            System.out.println("ALERT! CREDIT LIMIT EXCEEDED!");
        } else {
            System.out.println("CREDIT LIMIT IS SAFE."); 
        }
    }
}

public class CreditLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();  

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter total debits: ");
        double debits = scanner.nextDouble();  

        System.out.print("Enter total credits: ");
        double credits = scanner.nextDouble();  

        System.out.print("Enter credit limit: ");
        double creditLimit = scanner.nextDouble(); 

        // Customer object create karte hain with provided details
        Customer customer = new Customer(accountNo, initialBalance, creditLimit);
        customer.setDebits(debits); 
        customer.setCredits(credits); 

        
        customer.calculateBalance();  // Net balance calculate karte hain

        // Display the account details
        System.out.println("\n.......................ACCOUNT DETAILS......................."); 
        System.out.println("Account Number: " + customer.getAccountNo());  
        System.out.println("Current Balance: " + customer.getCurrentBalance()); 

        
        CreditLimitValidator.validateCreditLimit(customer);  // Credit limit check karte hain aur result show karte hain

        scanner.close();  // Scanner ko close karte hain
    }
}
