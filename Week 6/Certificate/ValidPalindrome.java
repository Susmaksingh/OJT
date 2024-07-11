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

public class ValidPalindrome {
    
    // Method to check if a string is a valid palindrome
    public static boolean isValidPalindrome(String s) {
        // If input string is null or empty, it's not a valid palindrome
        if (s == null || s.length() == 0) {
            return false;
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Print the cleaned string (optional, for debugging)
        System.out.println(s);
        
        // Check if the string is a palindrome
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        
        // If all characters match from both ends, it's a valid palindrome
        return true;
    }
    
    // Main method to test the isValidPalindrome function
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
    }
}

