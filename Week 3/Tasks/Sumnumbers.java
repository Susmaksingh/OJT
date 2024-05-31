/*1.	Write a program that reads a series of integers from the user and prints the sum of the numbers. The program should stop reading numbers when the user enters a negative number. Use the break statement to exit the loop.

 */

import java.util.*;
public class Sumnumbers{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int sum =0;
        while (true){
            System.out.print("Enter the negative number to stop:");
            int number =sc.nextInt();

            if(number<0){
                break;
            }
            sum+= number;
        }
        System.out.println("The sum of the number is :" + sum);
        
    }
}