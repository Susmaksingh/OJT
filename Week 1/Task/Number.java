import java.util.Scanner;

public class Number {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        if(number<0){
            System.out.println("Absolute value :" + (-1*number));
        }
        else{
            System.out.println("Absolute value :" + number);
        }
                
        }
    }

