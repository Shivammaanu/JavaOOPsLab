import java.util.Scanner;

class WashingMachine {
    boolean isOn;  // Washing machine ka on/off status
    int totalClothes;  // Total clothes jo washing machine me daale gaye hain

    // Method to switch on the washing machine
    void switchOn() {
        if (!isOn) {  // Agar washing machine already on nahi hai
            System.out.println("Washing Machine is now ON.");
        } else {
            System.out.println("Washing Machine is already ON.");
        }
    }

    // Method to accept clothes
    int acceptClothes(int noOfClothes) {
        if (isOn) {  // Agar washing machine on hai
            totalClothes = noOfClothes;  // Clothes ko machine mein daalna
            System.out.println(noOfClothes + " clothes added to the washing machine.");
        } else {
            System.out.println("Please switch on the washing machine first.");
        }
        return totalClothes;  // Kitni clothes daali gayi, wo return karenge
    }

    // Method to accept detergent
    void acceptDetergent() {
        if (isOn) {  // Agar washing machine on hai
            System.out.println("Detergent added to the washing machine.");
        } else {
            System.out.println("Please switch on the washing machine first.");
        }
    }

    // Method to switch off the washing machine
    void switchOff() {
        if (isOn) {  // Agar washing machine on hai
            isOn = false;  // Washing machine ko off karna
            System.out.println("Washing Machine is now OFF.");
        } else {
            System.out.println("Washing Machine is already OFF.");
        }
    }
}

public class WashingCloth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        WashingMachine wm = new WashingMachine();

        // Washing machine ko on kar rahe hain
        wm.switchOn();
        
        // User se clothes ki quantity puchhna
        System.out.print("Enter the number of clothes to add: ");
        int clothes = sc.nextInt();
        wm.acceptClothes(clothes);  // Clothes ko washing machine me daalna

        wm.acceptDetergent();  // Detergent daalna
        wm.switchOff();  // Washing machine ko off karna
    }
}
