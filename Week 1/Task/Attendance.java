import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        // Input number of classes held and attended
        System.out.print("Enter the number of classes held: ");
        int classesHeld = s.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int classesAttended = s.nextInt();

        // Calculate percentage of classes attended
        int attendancePercentage = (classesAttended * 100) / classesHeld;


        // Determine if the student is allowed to sit in the exam
        if (attendancePercentage >= 75) {
            System.out.println("Percentage of classes attended: " + attendancePercentage);
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.println("Percentage of classes attended: " + attendancePercentage);
            System.out.println("Student is NOT allowed to sit in the exam.");
        }

    }
}