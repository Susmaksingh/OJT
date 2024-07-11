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

public class MinimumSizeSubarraySum {

    // This function returns the minimum length of a contiguous subarray of which the sum ≥ s.
    public int minSubArrayLen(int s, int[] nums) {
        // If nums is null or empty, there is no subarray to consider, return 0.
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Initialize result to a large number (larger than any possible subarray length)
        int result = Integer.MAX_VALUE;
        
        // Initialize the start index of the sliding window and the current sum
        int start = 0;
        int sum = 0;
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Add the current element to the sum
            
            // While the current sum is greater than or equal to s, update the result
            while (sum >= s) {
                // Update the result with the minimum length found so far
                result = Math.min(result, i + 1 - start);
                
                // Subtract the element at the start index and move the start index forward
                sum -= nums[start];
                start++;
            }
        }
        
        // If result is still Integer.MAX_VALUE, it means no valid subarray was found
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }

    // Main method for testing
    public static void main(String[] args) {
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        
        // Test case
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        
        // Print the result
        System.out.println("The minimum length of a subarray with sum ≥ " + s + " is " + solution.minSubArrayLen(s, nums));
    }
}
