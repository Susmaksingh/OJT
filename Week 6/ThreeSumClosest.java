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

public class ThreeSumClosest {
    
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array for the two-pointer approach
        Arrays.sort(nums);
        
        // Initialize the closest sum to a large value
        int closestSum = nums[0] + nums[1] + nums[2];
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;  // Second pointer
            int k = nums.length - 1; // Third pointer
            
            // While there are elements between j and k
            while (j < k) {
                int currentSum = nums[i] + nums[j] + nums[k];
                
                // Check if the current sum is closer to the target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move the pointers based on the comparison of the current sum and target
                if (currentSum < target) {
                    j++; // Increment j to increase sum
                } else {
                    k--; // Decrement k to decrease sum
                }
            }
        }
        
        // Return the closest sum found
        return closestSum;
    }
    
    public static void main(String[] args) {
        // Example usage
        ThreeSumClosest tsc = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        
        // Calling the method and printing the result
        int result = tsc.threeSumClosest(nums, target);
        System.out.println("The sum closest to " + target + " is " + result);
    }
}

