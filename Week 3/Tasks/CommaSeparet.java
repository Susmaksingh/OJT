/*3.	Write a program that reads a comma-separated string of numbers from the user and converts it into an array of integers. Then, print the array. */

import java.util.*;

public class CommaSeparet{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number");

        String input = sc.nextLine();

        String[] strArray = input.split(",");

        int[] intArray = new int[strArray.length];

        for (int i = 0; i<strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i].trim());
        }
        System.out.print("The array of integer is :");
        for (int num :intArray){
            System.out.print(num +" ");
        }
        
    }
}