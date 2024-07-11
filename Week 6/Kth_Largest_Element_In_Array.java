/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
import java.util.Arrays;

public class Kth_Largest_Element_In_Array {
    // Method to find the k-th largest element in an array
    public int findKthLargest(int[] nums, int k) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        // Return the k-th largest element
        // Since arrays are 0-indexed, we use nums.length - k to get the k-th largest
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Kth_Largest_Element_In_Array solution = new Kth_Largest_Element_In_Array();

        // Example array
        int[] nums = {3, 2, 1, 5, 6, 4, 9};

        // Example value for k
        int k = 4;

        // Find and print the k-th largest element in the array
        int result = solution.findKthLargest(nums, k);
        System.out.println("The " + k + "-th largest element is " + result);
    }
}

