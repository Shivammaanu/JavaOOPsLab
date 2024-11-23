
class Student {
    // Method to calculate average and return pass/fail status
    String Average(int m1, int m2, int m3) {
        int avg = (m1 + m2 + m3) / 3;  
        System.out.println("Average: " + avg);
        if (avg > 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Method to return the name of the student
    String inputName(String name) {
        return name;
    }
}

public class Details {
    public static void main(String[] args) {
        Student r = new Student();
        
        System.out.println(r.inputName("Raheel") + " is " + r.Average(10, 40, 40));
    }
}
