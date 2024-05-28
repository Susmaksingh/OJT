import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("This is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This is uppercase.");
        } else {
            System.out.println("This is not a letter.");
        }
    }
}
