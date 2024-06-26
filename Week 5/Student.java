import java.util.Scanner;

public class Student {
    // Private fields
    private String name;
    private String studentId;
    private int grade;

    // Constructor
    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        setGrade(grade); // Use the setter to validate the grade
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter methods for grade
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's name
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        // Input the student's ID
        System.out.print("Enter the student's ID: ");
        String studentId = scanner.nextLine();

        // Input the student's grade
        System.out.print("Enter the student's grade: ");
        int grade = scanner.nextInt();

        // Creating a Student object
        Student student = new Student(name, studentId, grade);

        // Displaying the student information
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Grade: " + student.getGrade());

        // Testing the setters with new inputs
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the updated name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter the updated student ID: ");
        student.setStudentId(scanner.nextLine());

        System.out.print("Enter the updated grade: ");
        try {
            student.setGrade(scanner.nextInt());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Student ID: " + student.getStudentId());
        System.out.println("Updated Grade: " + student.getGrade());

        scanner.close();
    }
}
