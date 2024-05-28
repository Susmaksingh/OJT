import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = s.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = s.nextInt();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
