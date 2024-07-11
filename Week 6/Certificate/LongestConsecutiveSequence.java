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

public class LongestConsecutiveSequence {
    
    // Function to find the longest consecutive sequence in an array
    public static int longestConsecutive(int[] num) {
        // If the array is empty, return 0
        if (num.length == 0) {
            return 0;
        }
        
        // Use a HashSet to store the elements of the array
        Set<Integer> set = new HashSet<>();
        int max = 1; // Variable to store the maximum length of the consecutive sequence
        
        // Add all elements of the array to the HashSet
        for (int e : num) {
            set.add(e);
        }
        
        // Iterate through the elements of the array
        for (int e : num) {
            // Check if this element can be the start of a new sequence
            if (!set.contains(e - 1)) {
                int currentNum = e;
                int count = 1; // Start counting the length of the sequence
                
                // Check for the next elements in the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                
                // Update the maximum length found
                max = Math.max(max, count);
            }
        }
        
        return max; // Return the maximum length of the consecutive sequence
    }
    
    public static void main(String[] args) {
        // Example array to test the function
        int[] num = {100, 4, 200, 1, 3, 2};
        
        // Find and print the longest consecutive sequence
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(num));
    }
}
