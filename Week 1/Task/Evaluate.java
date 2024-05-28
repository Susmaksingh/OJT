public class Evaluate {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 0;

        boolean a = x == 2;
        System.out.println("a. x == 2: " + a);

        boolean b = x != 5;
        System.out.println("b. x != 5: " + b);

        boolean c = x != 5 && y >= 5;
        System.out.println("c. x != 5 && y >= 5: " + c);

        boolean d = z != 0 || x == 2;
        System.out.println("d. z != 0 || x == 2: " + d);

        boolean e = !(y < 10);
        System.out.println("e. !(y < 10): " + e);
    }
}

 