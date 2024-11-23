import java.util.*;

class Employee {
    String firstName; 
    String lastName;   
    double monthlySalary; 
    double yearlySalary;  

    // Constructor: Jab employee ko initialize karte hain
    Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;  // Agar salary valid ho toh set karo
        }
    }

    // Setters: Values ko set karne ke liye methods
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setMonthlySalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;  // Salary positive hone par hi set karenge
        }
    }

    // Getters: Values ko retrieve karne ke liye methods
    double getMonthlySalary() {
        return this.monthlySalary;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    void calculateYearlySalary() {
        this.yearlySalary = this.monthlySalary * 12; 
    }

    
    void displayYearlySalary() {
        System.out.println(this.firstName + " " + this.lastName + "'s yearly salary: " + this.yearlySalary);
    }

    void hike(double percentage) {
        // Yearly salary me hike laga ke new yearly salary calculate karte hain
        this.yearlySalary = this.yearlySalary * (1 + percentage / 100);
    }
}

public class EmployeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee e1 = new Employee("Shivam", "Gangwar", 75000);
        Employee e2 = new Employee("Maanu", "Gangwar", 80000);
        
        
        e1.calculateYearlySalary();
        e2.calculateYearlySalary();
        
       
        e1.displayYearlySalary();
        e2.displayYearlySalary();
        
    
        System.out.print("Enter the percentage hike: ");
        double hike = sc.nextDouble();
        
        // Hike apply karte hain dono employees par
        e1.hike(hike);
        e2.hike(hike);
        
       
        System.out.println(".................... AFTER HIKE ....................");
        e1.displayYearlySalary();
        e2.displayYearlySalary();
        
        sc.close();
    }
}
