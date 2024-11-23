import java.util.Scanner;

public class MCQ {

    // Ye method result report generate karta hai
    public static void generateReport(String answers[], String user[]) {
        System.out.println("Q" + "     " + "SUBMITTED ANSWER" + "     " + "CORRECT ANS" + "     " + "RESULT");
        for (int i = 0; i < answers.length; i++) {
            // Agar user ka answer correct hai, toh CORRECT dikhayenge
            if (user[i].equals(answers[i])) {
                System.out.println((i + 1) + "     " + user[i] + "     " + answers[i] + "    CORRECT");
            }
            // Agar user ka answer empty hai, matlab unanswered hai, toh UNANSWERED dikhayenge
            else if (user[i].equals("")) {
                System.out.println((i + 1) + "     " + user[i] + "     " + answers[i] + "    UNANSWERED");
            }
            // Agar answer wrong hai, toh WRONG dikhayenge
            else {
                System.out.println((i + 1) + "     " + user[i] + "     " + answers[i] + "    WRONG");
            }
        }
    }

    // Ye method quiz ko conduct karta hai
    public static void conductQuiz(String answers[]) {
        Scanner sc = new Scanner(System.in);
        String user[] = new String[answers.length];

        // Har question ke liye user se answer lena
        for (int i = 0; i < answers.length; i++) {
            System.out.print((i + 1) + ". ");
            user[i] = sc.nextLine();
        }

        int correct = 0;   // Correct answers ka count
        int unanswered = 0;   // Unanswered answers ka count
        int wrong = 0;   // Wrong answers ka count

        // Correct, wrong, aur unanswered answers ka count karna
        for (int i = 0; i < answers.length; i++) {
            if (user[i].equals(answers[i])) {
                correct++;   // Agar user ka answer correct hai
            } else if (user[i].equals("")) {  // Agar user ne answer nahi diya (empty)
                unanswered++;   // Unanswered ka count badhaye
            } else {
                wrong++;   // Agar answer wrong hai
            }
        }

        // Result report generate karna
        generateReport(answers, user);

        // Correct, wrong, aur unanswered answers ka summary print karna
        System.out.println("Number of Correct Answers: " + correct);
        System.out.println("Number of Wrong Answers: " + wrong);
        System.out.println("Number of Unanswered Answers: " + unanswered);
    }

    // Main method, jahan se program start hota hai
    public static void main(String[] args) {
        // Correct answers jo predefined hain
        String answers[] = {"c", "a", "b", "d", "b", "c", "c", "a"};
        
        // Conduct quiz function call karte hain
        conductQuiz(answers);
    }
}
