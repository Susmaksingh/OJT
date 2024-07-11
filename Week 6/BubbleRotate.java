/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
public class BubbleRotate {

    // Method to rotate the array in-place with O(1) space
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        // Reduce k to within the bounds of the array length
        k = k % nums.length;

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        // Create an instance of ArrayRotator
        BubbleRotate rotator = new BubbleRotate();
        
        // Define the array and the rotation step
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        
        // Rotate the array
        rotator.rotate(nums, k);
        
        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

