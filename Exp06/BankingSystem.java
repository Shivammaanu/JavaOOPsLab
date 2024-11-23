import java.util.Scanner;

class Bank {
    double balance;  // Bank account ka balance

    // Deposit method: Amount ko deposit karke new balance return karega
    double deposit(double amount) {
        balance += amount;  // Deposit amount ko current balance mein add karna
        System.out.println("Amount deposited: " + amount);
        return balance;  // New balance return karna
    }

    // Withdraw method: Agar balance sufficient hai to withdraw karega
    double withdraw(double amount) {
        if (balance >= amount) {  // Agar balance enough hai
            balance -= amount;  // Amount ko withdraw karna
            System.out.println("Amount withdrawn: " + amount);
        } else {  // Agar balance kam hai
            System.out.println("Insufficient balance!");
            return 0;  // Agar balance enough nahi hai to 0 return karenge
        }
        return balance;  // New balance return karenge
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Bank ka object create kar rahe hain
        Bank bankAccount = new Bank();

        // Initial balance set karna
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = sc.nextDouble();
        bankAccount.deposit(initialDeposit);  // Initial deposit karna

        // Deposit karna
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        bankAccount.deposit(depositAmount);  // Amount deposit karna

        // Withdraw karna
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        bankAccount.withdraw(withdrawAmount);  // Amount withdraw karna

        // Final balance dikhana
        bankAccount.displayBalance();
    }
}
