public class Students {
    // Private fields
    private String name;
    private String studentId;
    private int grade;

    // Constructor
    public Students(String name, String studentId, int grade) {
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
        // Creating a Student object
        Students student = new Students("Susma", "R001", 75);

        // Testing the getters
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Grade: " + student.getGrade());

        // Testing the setters
        student.setName("Shikha");
        student.setStudentId("R001");
        student.setGrade(85);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Student ID: " + student.getStudentId());
        System.out.println("Updated Grade: " + student.getGrade());

        // Testing grade validation
        try {
            student.setGrade(105); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
