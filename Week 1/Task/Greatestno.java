import java.util.Scanner;

class Greatestno {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int firstNumber = s.nextInt();

        System.out.print("Enter second value: ");
        int secondNumber = s.nextInt();

        int greatestNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;

        System.out.println("The greatest number is: " + greatestNumber);

    
    }
}
