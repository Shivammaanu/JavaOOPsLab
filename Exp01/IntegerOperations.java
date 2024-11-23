import java.util.*;

// TwoNumbers class banaya gaya hai jo do integers ke operations handle karega
class TwoNumbers {
    int num1; 
    int num2; 

    // Constructor jo do integers initialize karega
    TwoNumbers(int number1, int number2) {
        this.num1 = number1;
        this.num2 = number2;
    }

    // Dono numbers ka sum return karega
    int calculateSum() {
        return this.num1 + this.num2;
    }

    // Dono numbers ka difference return karega (absolute value)
    int calculateDifference() {
        return Math.abs(this.num1 - this.num2);
    }

    // Dono numbers ka product return karega
    int calculateProduct() {
        return this.num1 * this.num2;
    }

    // Dono numbers ka quotient return karega (bada number chhote number se divide hoga)
    int calculateQuotient() {
        if (this.num1 > this.num2) {
            return this.num1 / this.num2;
        } else {
            return this.num2 / this.num1;
        }
    }
}

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // User input ke liye scanner object
        System.out.print("Enter first number(x): ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter Second number (y): "); 
        int secondNumber = scanner.nextInt();

        
        TwoNumbers numbers = new TwoNumbers(firstNumber, secondNumber);

        
        System.out.println("Sum (x + y): " + numbers.calculateSum());
        System.out.println("Difference |x - y|: " + numbers.calculateDifference());
        System.out.println("Product (x * y): " + numbers.calculateProduct());
        System.out.println("Quotient (large/small): " + numbers.calculateQuotient());
    }
}
