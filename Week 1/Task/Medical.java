import java.util.Scanner;

public class Medical {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println("Is the student unable to sit due to a medical cause? (Y/N)");
        String hasMedicalCause = s.next();

        if (hasMedicalCause.equalsIgnoreCase("Y")) {
            System.out.println("The student is allowed to sit.");
        } else if (hasMedicalCause.equalsIgnoreCase("N")) {
            System.out.println("The student is not allowed to sit.");
        } else {
            System.out.println("Invalid input. Please enter Y or N.");
        }

    }
}

 