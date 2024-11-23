import java.util.*;

class CustomDate {
    int day;    
    int month; 
    int year;  

    // Constructor to initialize the date
    CustomDate(int day, int month, int year) {
        // Agar din ya mahina invalid ho, toh error message dikhate hain
        if (month > 12 || day < 1 || day > 31) {
            System.out.println("INVALID DATE INPUT");
        } else if (month == 2 && day > 29) {  // February me 29 se zyada din nahi ho sakte
            System.out.println("INVALID DATE INPUT: February can't have more than 29 days");
        } else if (month == 2 && day == 29 && !isLeapYear(year)) {
            System.out.println("INVALID DATE INPUT: " + year + " is not a leap year, February can't have 29 days");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("INVALID DATE INPUT: This month can't have more than 30 days");
        } else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    
    boolean isLeapYear(int year) {
        // Leap year condition: divisible by 4, but not by 100 unless divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Setters: Yeh methods date ko update karne ke liye hain
    void setDay(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setYear(int year) {
        this.year = year;
    }

    // Getters: Yeh methods date ko retrieve karne ke liye hain
    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    // Method to display the date in dd/mm/yyyy format
    void displayDate() {
        System.out.println("Date is: " + this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }
}

public class DateDisplayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter day: ");
        int inputDay = scanner.nextInt();
        
        System.out.print("Enter month: ");
        int inputMonth = scanner.nextInt();  
        
        System.out.print("Enter year: ");
        int inputYear = scanner.nextInt();  
        
        CustomDate date = new CustomDate(inputDay, inputMonth, inputYear);

        // Agar date valid hai toh display karenge
        if (inputDay >= 1 && inputDay <= 31 && inputMonth >= 1 && inputMonth <= 12) {
            date.displayDate();
        }

        scanner.close();  
        
    }
}
