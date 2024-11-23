class Teacher {
    String name;
    String subject;
    int experience;

    // Teacher constructor
    Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    // Teacher ke details ko display karna
    void displayTeacherDetails() {
        System.out.println("Teacher's details:");
        System.out.println("Name: " + this.name);
        System.out.println("Subject: " + this.subject);
        System.out.println("Experience: " + this.experience + " saal");
    }
}

class Student extends Teacher {
    int rollNumber;
    String grade;

    // Student ka constructor jo Teacher se inherit hota hai
    public Student(String name, String subject, int experience, int rollNumber, String grade) {
        super(name, subject, experience);  // Teacher ke constructor ko call karna
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Student ke details ko display karna
    public void displayStudentDetails() {
        System.out.println("Student's Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class StudentTeacher {
    public static void main(String[] args) {
        // Ek Student ka object banate hain, jo Teacher ki details bhi rakhta hai
        Student student = new Student("Praveen Sir", "JAVA", 20, 49, "A");

        // Teacher ke details print karte hain
        System.out.println("Teacher Details:");
        student.displayTeacherDetails();

        // Student ke details print karte hain
        System.out.println("\nStudent Details:");
        student.displayStudentDetails();
    }
}
