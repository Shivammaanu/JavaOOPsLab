import java.util.*;

abstract class Figure {
    double r; 
    double a;  
    double v;  

    // Area aur Volume ko display karne ke liye abstract methods
    public abstract void dispArea();
    public abstract void dispVolume();
}

class Cone extends Figure {
    double h; 
    double r; 
    double l; 

    // Constructor to initialize Cone ke parameters
    Cone(double h, double r, double l) {
        super();  // Super class (Figure) ka constructor call
        this.h = h;
        this.r = r;
        this.l = l;
    }


    public void dispArea() {
        System.out.println("Area of Cone: " + Math.PI * this.r * (this.r + this.l));
    }

    
    public void dispVolume() {
        System.out.println("Volume of Cone: " + Math.PI * this.r * this.r * this.h * 0.33);
    }
}

public class Shapes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the value of radius: ");
        double r = sc.nextDouble();

        
        System.out.print("Enter the height of the cone: ");
        double h = sc.nextDouble();

        
        System.out.print("Enter the Slant height of the cone: ");
        double l = sc.nextDouble();

    
        Cone cone = new Cone(h, r, l);

        // Area aur Volume ko display kar rahe hain
        cone.dispArea();
        cone.dispVolume();
    }
}
