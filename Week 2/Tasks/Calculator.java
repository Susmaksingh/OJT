public class Calculator {

    // Static method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Static method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Static method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Static method for division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        double num1 = 25.0;
        double num2 = 5.0;

        // Perform calculations
        double sum = Calculator.add(num1, num2);
        double difference = Calculator.subtract(num1, num2);
        double product = Calculator.multiply(num1, num2);
        double quotient = Calculator.divide(num1, num2);

        // Display results
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);

        // Demonstrate division by zero exception handling
        try {
            double invalidDivision = Calculator.divide(num1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
