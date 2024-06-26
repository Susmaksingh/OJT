public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    double add(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(5, 3);
        double sum2 = calc.add(6.2, 3.6);
        int sum3 = calc.add(1, 2, 3);
        double sum4 = calc.add(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Sum of integers : " + sum3);
        System.out.println("Sum of doubles: " + sum4);
    }
}
