/*6.	Write a program that continuously reads integers from the user and calculates their sum. The program should ignore any negative numbers and should stop reading when the user enters zero. Use the continue statement to skip the negative numbers. */

import java.util.*;

public class Continuously{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum =0;
        while (true){
            System.out.print("Enter the zero to stop:");
            int number =sc.nextInt();

            if(number==0){
                break;
            }

             if(number<0){
                continue;
            }
            sum+= number;
        }
        System.out.println("The sum of the number is :" + sum);

    }
}