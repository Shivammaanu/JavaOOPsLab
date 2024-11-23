import java.util.Scanner;

// CircleProperties class banaya gaya hai jo circle ke properties calculate karega
class CircleProperties {
    int radius; 

    // Constructor jo radius initialize karega
    CircleProperties(int inputRadius) {
        radius = inputRadius;
    }

    // Diameter calculate karne ka method
    int calculateDiameter() {
        return 2 * radius;
    }

    // Circumference calculate karne ka method
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Area calculate karne ka method
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Input ke liye scanner object
        System.out.print("Enter the Radius of Circle: ");
        int userRadius = input.nextInt(); 


        CircleProperties circle = new CircleProperties(userRadius);

      
        System.out.println("Enter Your choice b/w (1 to 3):");
        System.out.println("1 -> Diameter");
        System.out.println("2 -> Circumference");
        System.out.println("3 -> Area");
        int userChoice = input.nextInt();

       
        switch (userChoice) {
            case 1:
                System.out.println("Circle ka Diameter: " + circle.calculateDiameter());
                break;
            case 2:
                System.out.println("Circle ki Circumference: " + circle.calculateCircumference());
                break;
            case 3:
                System.out.println("Circle ka Area: " + circle.calculateArea());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
