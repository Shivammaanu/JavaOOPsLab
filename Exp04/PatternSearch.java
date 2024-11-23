import java.util.Scanner;

public class PatternSearch {

    // Method to count the occurrences of a pattern in numbers within a given range
    public static int countPatternOccurrences(int startRange, int endRange, String pattern) {
        int totalOccurrences = 0; // Pattern occurrences ko count karne ke liye

        // Har number ko string mein convert karke pattern search karo
        for (int currentNumber = startRange; currentNumber <= endRange; currentNumber++) {
            String numberAsString = Integer.toString(currentNumber); // Number ko string mein badla
            
            int index = numberAsString.indexOf(pattern); // Pattern ka first occurrence dhundo
            while (index != -1) {
                totalOccurrences++; // Pattern mil gaya, count badhao
                index = numberAsString.indexOf(pattern, index + 1); // Agla occurrence 
            }
        }

        return totalOccurrences; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the Range of Start and End:  ");
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();

        System.out.print("Enter the Pattern to Search: ");
        String patternToSearch = scanner.next();

        // Pattern occurrences count 
        int result = countPatternOccurrences(startRange, endRange, patternToSearch);

       
        System.out.println("Pattern " + patternToSearch + " comes "+result+" times in between "+startRange + " to "+endRange+".");

        scanner.close(); 
    }
}
