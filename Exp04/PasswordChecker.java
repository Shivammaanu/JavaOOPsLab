import java.util.Scanner;

public class PasswordChecker {

    // Method to check if the password is valid
    public static boolean isValidPassword(String password) {
        boolean isValid = true; 

        // Step 1: Check length (5-12 ke beech honi chahiye)
        if (password.length() < 5 || password.length() > 12) {
            isValid = false;
            System.out.println("The length of Password Should be b/w 5-12.");
            return isValid;
        }

        // Step 2: Check if it contains any uppercase letter
        if (!password.toLowerCase().equals(password)) {
            isValid = false;
            System.out.println("Uppercase letter Should not in Password.");
            return isValid;
        }

        // Step 3: Check for digits and special characters
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            // Digit check
            if (Character.isDigit(currentChar)) {
                hasDigit = true;
            }

            // Special character check
            if ((currentChar >= 33 && currentChar <= 47) || (currentChar >= 58 && currentChar <= 64)) {
                isValid = false;
                System.out.println("Special is not allowed in Password.");
                return isValid;
            }
        }

        // Step 4: Check if it lacks digits
        if (!hasDigit) {
            isValid = false;
            System.out.println("Atleast one numerical digit should be in password!");
            return isValid;
        }

        return isValid; // If all checks pass, password is valid
    }

    // Method to check if the password contains immediate repeated patterns
    public static boolean hasImmediatePattern(String password) {
        for (int i = 0; i < password.length() - 1; i++) {
            for (int len = 1; i + 2 * len <= password.length(); len++) {
                // Substring at position i of length `len` and the next substring of same length
                String firstPattern = password.substring(i, i + len);
                String nextPattern = password.substring(i + len, i + 2 * len);

                // Check if both patterns are the same
                if (firstPattern.equals(nextPattern)) {
                    System.out.println("Immediate Pattern present in the password." + firstPattern);
                    return true;
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        
        boolean isValid = isValidPassword(password);
        boolean hasPattern = hasImmediatePattern(password);

        
        if (isValid && !hasPattern) {
            System.out.println("Password is valid !");
        } else {
            System.out.println("Password is not valid ");
        }

        sc.close();
    }
}
