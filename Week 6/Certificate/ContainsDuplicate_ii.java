/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
import java.util.HashMap;

public class ContainsDuplicate_ii {
    // This method checks if there are duplicates in the array nums such that the difference between their indices is at most k
    public boolean containNearbyDuplicate(int[] nums, int k) {
        // Create a HashMap to store the elements and their latest indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the map, check the difference in indices
            if (map.containsKey(nums[i])) {
                int preIndex = map.get(nums[i]);
                int gap = i - preIndex;
                // If the difference is less than or equal to k, return true
                if (gap <= k) {
                    return true;
                }
            }
            // Update the map with the current element's index
            map.put(nums[i], i);
        }
        // If no such duplicates are found, return false
        return false;
    }

    // Main method to test the containNearbyDuplicate method
    public static void main(String[] args) {
        ContainsDuplicate_ii obj = new ContainsDuplicate_ii();
        int[] nums = {1, 2, 3, 5, 1};
        int k = 9;
        // Testing the method with sample input
        boolean result = obj.containNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicates: " + result);
    }
}
