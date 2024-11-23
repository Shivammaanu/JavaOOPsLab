import java.util.Scanner;

// Interface jo different operations declare karega
interface NumberOperations {
    int calculateSum(); 
    double calculateAverage(); 
    int calculateProduct(); 
    int findLargest(); 
    int findSmallest();
}

// Abstract class jo interface ko implement karega aur methods ka common logic dega
abstract class AbstractNumberProcessor implements NumberOperations {
    int num1, num2, num3; 

    // Constructor jo teeno numbers ko initialize karega
    public AbstractNumberProcessor(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    
    public int calculateSum() {
        return num1 + num2 + num3;
    }

    
    public double calculateAverage() {
        return calculateSum() / 3.0;
    }

    
    public int calculateProduct() {
        return num1 * num2 * num3;
    }

    
    public int findLargest() {
        return Math.max(num1, Math.max(num2, num3));
    }

    
    public int findSmallest() {
        return Math.min(num1, Math.min(num2, num3));
    }
}

// Concrete class jo AbstractNumberProcessor ko extend karega
class NumberProcessor extends AbstractNumberProcessor {

    // Constructor jo numbers ko AbstractNumberProcessor ko pass karega
    public NumberProcessor(int num1, int num2, int num3) {
        super(num1, num2, num3);
    }

    // Additional methods ki zarurat nahi, sab inherited functionality use ho rahi hai
}

public class NumberAnalysisApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input lene ke liye Scanner object

        
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        
        NumberProcessor processor = new NumberProcessor(number1, number2, number3);

        
        System.out.println("Sum: " + processor.calculateSum()); 
        System.out.println("Average: " + processor.calculateAverage()); 
        System.out.println("Product: " + processor.calculateProduct()); 
        System.out.println("Largest: " + processor.findLargest()); 
        System.out.println("Smallest: " + processor.findSmallest());
    }
}
