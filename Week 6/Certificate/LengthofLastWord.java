/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
import java.util.*;

public class LengthofLastWord {

    // Method to find the length of the last word in a given string
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0; // If the input string is null or empty, return 0
        }

        int result = 0; // Variable to store the length of the last word
        int len = s.length(); // Get the length of the input string

        boolean flag = false; // Flag to indicate if we have encountered a valid character of the last word
        for (int i = len - 1; i >= 0; i--) { // Traverse the string from the end to the beginning
            char c = s.charAt(i); // Get the current character
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) { // Check if the character is a letter
                flag = true; // Set the flag to true indicating we are counting the last word
                result++; // Increment the result as we have found a letter
            } else {
                if (flag) { // If we have encountered a letter before and now a non-letter character
                    return result; // Return the length of the last word
                }
            }
        }
        return result; // Return the length of the last word if no non-letter character is encountered after the last word
    }

    // Main method to test the lengthOfLastWord method
    public static void main(String[] args) {
        LengthofLastWord solution = new LengthofLastWord();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string from the user

        int length = solution.lengthOfLastWord(input); // Calculate the length of the last word
        System.out.println("The length of the last word is: " + length); // Print the result

        scanner.close(); // Close the scanner
    }
}

