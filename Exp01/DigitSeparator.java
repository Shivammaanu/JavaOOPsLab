import java.util.*;

// IndividualDigits class jo number ke har digit ko separate print karega
class IndividualDigits {
    int number; 

    // Constructor jo number initialize karega
    IndividualDigits(int number) {
        this.number = number;
    }

    // Har digit ko alag-alag print karne ka method
    void printDigits() {
        String numberStr = Integer.toString(number); // Number ko string me convert karte hain
        for (int i = 0; i < numberStr.length(); i++) {
            System.out.print(numberStr.charAt(i) + "    "); 
        }
        System.out.println(); 
    }
}

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter 5-digit number: "); 
        int inputNumber = scanner.nextInt(); 

        
        if (inputNumber < 10000 || inputNumber > 99999) { // Check karte hain ki number 5-digit ka hai ya nahi
            System.out.println("Invalid input! Please enter 5-digit number.");
        } else {
            
            IndividualDigits digits = new IndividualDigits(inputNumber);
            digits.printDigits();
        }
    }
}
