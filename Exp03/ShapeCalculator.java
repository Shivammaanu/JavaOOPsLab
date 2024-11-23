
import java.util.*;

// Abstract class Shape, jo geometric shapes ka area aur volume calculate karne ke liye base functions define karta hai
abstract class Shape {

    double pi = 3.1420;
    double area;
    double volume;
    double radius;

    // Abstract methods jo har derived class mein implement hote hain
    public abstract void calculateArea();

    public abstract void calculateVolume();

    public abstract void displayArea();

    public abstract void displayVolume();
}

// Cone class, jo Shape class ko extend karti hai aur cone ka area aur volume calculate karti hai
class Cone extends Shape {

    double height;
    double slantHeight;

    // Constructor 
    Cone(double height, double slantHeight, double radius) {
        this.height = height;
        this.slantHeight = slantHeight;
        this.radius = radius;
    }

    // Area calculate karna: Cone ka surface area calculate karne ka formula
    public void calculateArea() {
        this.area = this.pi * this.radius * (this.radius + this.slantHeight);
    }

    // Volume calculate karna: Cone ka volume calculate karne ka formula
    public void calculateVolume() {
        this.volume = this.pi * (this.radius) * (this.radius) * (this.height) * (0.33);
    }

    // Area ko display karna
    public void displayArea() {
        System.out.println("Surface Area of Cone: " + this.area);
    }

    // Volume ko display karna
    public void displayVolume() {
        System.out.println("Volume of Cone: " + this.volume);
    }
}

// Sphere class, jo Shape class ko extend karti hai aur sphere ka area aur volume calculate karti hai
class Sphere extends Shape {

    // Constructor jo radius ko input leta hai
    Sphere(double radius) {
        this.radius = radius;
    }

    // Area calculate karna: Sphere ka surface area calculate karne ka formula
    public void calculateArea() {
        this.area = 4 * this.pi * this.radius * this.radius;
    }

    // Volume calculate karna: Sphere ka volume calculate karne ka formula
    public void calculateVolume() {
        this.volume = (1.33) * this.pi * this.radius * this.radius * this.radius;
    }

    // Area ko display karna
    public void displayArea() {
        System.out.println("Surface Area of Sphere: " + this.area);
    }

    // Volume ko display karna
    public void displayVolume() {
        System.out.println("Volume of Sphere: " + this.volume);
    }
}

// Cylinder class, jo Shape class ko extend karti hai aur cylinder ka area aur volume calculate karti hai
class Cylinder extends Shape {

    double height;  // Cylinder ki height

    // Constructor
    Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Area calculate karna: Cylinder ka surface area calculate karne ka formula
    public void calculateArea() {
        this.area = 2 * this.pi * this.radius * this.height;
    }

    // Volume calculate karna: Cylinder ka volume calculate karne ka formula
    public void calculateVolume() {
        this.volume = this.pi * this.radius * this.radius * this.height;
    }

    // Area ko display karna
    public void displayArea() {
        System.out.println("Surface Area of Cylinder: " + this.area);
    }

    // Volume ko display karna
    public void displayVolume() {
        System.out.println("Volume of Cylinder: " + this.volume);
    }
}

public class ShapeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Cone ke liye radius, height aur slant height input lena
        System.out.println("For Cone: ");
        System.out.print("Enter radius of cone: ");
        double coneRadius = sc.nextDouble();
        System.out.print("Enter height of cone: ");
        double coneHeight = sc.nextDouble();
        System.out.print("Enter slant height of cone: ");
        double coneSlantHeight = sc.nextDouble();
        Cone cone = new Cone(coneHeight, coneSlantHeight, coneRadius);  // Cone ka object create karna

        // Sphere ke liye radius input lena
        System.out.println("For Sphere: ");
        System.out.print("Enter radius of sphere: ");
        double sphereRadius = sc.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);  // Sphere ka object create karna

        // Cylinder ke liye radius aur height input lena
        System.out.println("For Cylinder: ");
        System.out.print("Enter radius of cylinder: ");
        double cylinderRadius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderHeight, cylinderRadius);  // Cylinder ka object create karna

        // Sphere ke area aur volume ko calculate karna aur display karna
        System.out.println("SPHERE: ");
        sphere.calculateArea();
        sphere.calculateVolume();
        sphere.displayArea();
        sphere.displayVolume();

        // Cylinder ke area aur volume ko calculate karna aur display karna
        System.out.println("CYLINDER: ");
        cylinder.calculateArea();
        cylinder.calculateVolume();
        cylinder.displayArea();
        cylinder.displayVolume();

        // Cone ke area aur volume ko calculate karna aur display karna
        System.out.println("CONE: ");
        cone.calculateArea();
        cone.calculateVolume();
        cone.displayArea();
        cone.displayVolume();
    }
}
