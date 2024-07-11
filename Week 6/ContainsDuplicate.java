/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
import java.util.HashSet;

public class ContainsDuplicate {

    // Method to check if the array contains any duplicates
    public boolean containsDuplicate(int[] nums) {
        // If the array is null or empty, there are no duplicates
        if (nums == null || nums.length == 0) {
            return false;
        }

        // Create a HashSet to store the unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through each element in the array
        for (int num : nums) {
            // If the element is already in the set, we found a duplicate
            if (!set.add(num)) {
                return true;
            }
        }

        // If we complete the loop without finding duplicates, return false
        return false;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of ContainsDuplicate
        ContainsDuplicate checker = new ContainsDuplicate();

        // Example array
        int[] nums = {1, 2, 3, 1};

        // Call the containsDuplicate method and print the result
        boolean result = checker.containsDuplicate(nums);

        // Output the result
        System.out.println("Contains duplicates: " + result);
    }
}

