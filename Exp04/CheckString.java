import java.util.HashMap;
import java.util.Scanner;

public class CheckString {

    // Yeh method un characters ko dhundta hai jo string mein 'n' se zyada baar aaye hain
    public static void findFrequentCharacters(String inputString, int Count_num) {

        // Step 1: Har character ki frequency count karne ke liye HashMap ka use
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i); // Current character ko nikalo

            // Agar character pehle se map mein hai, to uska count increment karo, warna 1 set karo
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }

        // Step 2: Un characters ko identify karo jo Count_num (n) se zyada baar aaye hain
        StringBuilder resultCharacters = new StringBuilder(); // Result store karne ke liye StringBuilder
        for (Character character : frequencyMap.keySet()) {
            if (frequencyMap.get(character) > Count_num) {
                resultCharacters.append(character); // Agar frequency n se zyada ho, to result mein add karo
            }
        }

        // Result print karo
        System.out.println("Characters jo " + Count_num + " se zyada baar aaye hain: " + resultCharacters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();

        // User se Count_num (n) input lo
        System.out.print("Enter n to check that how many time a char occur: ");
        int Count_num = scanner.nextInt();

        // Frequent characters ko find karne ke liye method call karo
        findFrequentCharacters(inputString, Count_num);

        scanner.close(); // Scanner close kar do, kyunki ab zarurat nahi hai
    }
}
