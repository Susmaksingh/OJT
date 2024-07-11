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

public class Implement_strStr {
    
    // This method finds the first occurrence of the substring 'needle' in the string 'haystack'
    public int strStr(String haystack, String needle) {
        // If either string is null, return -1 (indicating no valid input)
        if (haystack == null || needle == null) return -1;
        // If the needle is an empty string, return 0 (empty string is found at the start)
        if (needle.length() == 0) return 0;
        
        // Iterate through the haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Assume a match is found
            boolean found = true;
            // Check the substring from the current position
            for (int j = 0; j < needle.length(); j++) {
                // If there's a mismatch, break and set found to false
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            // If a match is found, return the starting index
            if (found) return i;
        }
        // If no match is found, return -1
        return -1;
    }
    
    // Main method for testing the strStr method
    public static void main(String[] args) {
        Implement_strStr implementStrStr = new Implement_strStr();
        
        // Test cases
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Index: " + implementStrStr.strStr(haystack1, needle1)); // Output: 2
        
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Index: " + implementStrStr.strStr(haystack2, needle2)); // Output: -1
        
        String haystack3 = "mississippi";
        String needle3 = "issi";
        System.out.println("Index: " + implementStrStr.strStr(haystack3, needle3)); // Output: 1
        
        String haystack4 = "abcdef";
        String needle4 = "";
        System.out.println("Index: " + implementStrStr.strStr(haystack4, needle4)); // Output: 0
        
        String haystack5 = "";
        String needle5 = "a";
        System.out.println("Index: " + implementStrStr.strStr(haystack5, needle5)); // Output: -1
    }
}
