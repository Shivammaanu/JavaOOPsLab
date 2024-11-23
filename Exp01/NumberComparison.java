import java.util.Scanner;

// CompareNumbers class jo do numbers ke beech comparison karega
class CompareNumbers {
    int num1; 
    int num2;

    // Constructor jo dono numbers initialize karega
    CompareNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method jo check karega kaunsa number bada hai
    void findLarger() {
        if (this.num1 > this.num2) {
            System.out.println(this.num1 + " is larger!");
        } else if (this.num2 > this.num1) {
            System.out.println(this.num2 + " is larger!");
        } else {
            System.out.println("Both numbers are equal!");
        }
    }
}

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (x): "); 
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number (y): ");
        int secondNumber = scanner.nextInt();

        
        CompareNumbers comparison = new CompareNumbers(firstNumber, secondNumber);
        comparison.findLarger(); // Larger number find karne ka method call karte hain
    }
}
