import java.util.*;

// X class jo ki basic addition aur initialization ka kaam karti hai
class Base {
    int firstValue;  
    int secondValue;  

    // Constructor jo firstValue aur secondValue ko initialize karta hai
    Base(int secondValue, int firstValue) {
        this.secondValue = secondValue;  
        this.firstValue = firstValue; 
    }

    // Method jo final sum calculate karta hai firstValue aur secondValue ka
    public int calculateSum() {
        return this.firstValue + this.secondValue;  // Return karta hai firstValue aur secondValue ka sum
    }
}

// Y class jo Base class se inherit ho rahi hai aur product calculate karti hai
class Derived extends Base {

    // Constructor jo firstValue aur secondValue ko Base class ke constructor se pass karta hai
    Derived(int firstValue, int secondValue) {
        super(firstValue, secondValue);  // Parent class Base ke constructor ko call karta hai
    }

    // Method jo firstValue aur secondValue ka product return karta hai
    public int calculateProduct() {
        return this.firstValue * this.secondValue;  // firstValue aur secondValue ka multiplication
    }
}

// Extended class jo Derived class se inherit ho rahi hai aur kisi bhi additional kaam ko nahi kar rahi
class FinalClass extends Derived {
    
    // Constructor jo Derived class ke constructor ko call karta hai
    FinalClass(int firstValue, int secondValue) {
        super(firstValue, secondValue);  // Derived class ke constructor ko call karte hain
    }
}


public class XYZ {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first value: ");
        int firstValue = scanner.nextInt();

        
        System.out.print("Enter second value: ");
        int secondValue = scanner.nextInt();

        
        FinalClass finalObject = new FinalClass(firstValue, secondValue);

        // Product ko display kar rahe hain jo FinalClass ke calculateProduct() se aa raha hai
        System.out.println("Product: " + finalObject.calculateProduct());

        // Sum ko display kar rahe hain jo FinalClass ke calculateSum() se aa raha hai
        System.out.println("Sum: " + finalObject.calculateSum());
    }
}
