import java.util.Scanner;

class Bonus 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = s.nextInt();

        System.out.print("Enter your years of service: ");
        int yearsOfService = s.nextInt();

        int bonus = 0;

        if (yearsOfService > 5) {
            bonus = (int) (salary * 0.05);
        }
        else{
            System.out.println("Not more than 5 yeras");
        }

        System.out.println("Your net bonus amount is: " + bonus);

    }
}
