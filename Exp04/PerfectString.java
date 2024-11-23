import java.util.HashSet;
import java.util.Scanner;

public class PerfectString {

    
    public static boolean isPerfectString(String inputString) {

        // Step 1: Remove spaces and convert the string to lowercase
        inputString = inputString.toLowerCase().replaceAll(" ", ""); 

        // Step 2: Check for unique characters using a HashSet
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for (char ch : inputString.toCharArray()) {
            if (uniqueCharacters.contains(ch)) {
                return false; // Agar duplicate character milta hai, toh perfect nahi hai
            }
            uniqueCharacters.add(ch);
        }

        // Step 3: Check if all alphabets ('a' to 'z') are present
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!uniqueCharacters.contains(ch)) {
                return false; // Agar koi alphabet missing hai, toh perfect nahi hai
            }
        }

        return true; // Agar dono conditions pass ho gayi, toh string perfect hai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        
        boolean result = isPerfectString(inputString);
        if (result) {
            System.out.println("The string is a perfect string!");
        } else {
            System.out.println("The string is not a perfect string.");
        }

        sc.close(); 
    }
}
