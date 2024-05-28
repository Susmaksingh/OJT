import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentId;
    private String name;
    private int age;
    private List<Double> grades;

    // Constructor
    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade. Must be between 0 and 100.");
        }
    }

    // Method to update grades (replace all grades)
    public void updateGrades(List<Double> newGrades) {
        grades.clear();
        for (double grade : newGrades) {
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade found in new grades. Must be between 0 and 100.");
                return;
            }
        }
        System.out.println("Grades updated.");
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + grades);
    }

    public static void main(String[] args) {
        // Create some student objects
        Student student1 = new Student("S001", "Susma", 24);
        Student student2 = new Student("S002", "Archana", 20);

        // Add grades
        student1.addGrade(85.5);
        student1.addGrade(90.0);
        student2.addGrade(78.0);
        student2.addGrade(82.5);

        // Display student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        // Update grades
        List<Double> newGrades = new ArrayList<>();
        newGrades.add(88.0);
        newGrades.add(92.5);
        student1.updateGrades(newGrades);

        // Display updated student information
        student1.displayStudentInfo();
    }
    
}
