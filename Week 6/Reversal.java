/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
public class Reversal {

    // Method to rotate the array in-place with O(1) space
    public void rotate(int[] arr, int order) {
        if (arr == null || arr.length == 0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        // Reduce order to within the bounds of the array length
        order = order % arr.length;

        // Length of the first part
        int a = arr.length - order;

        // Reverse the first part
        reverse(arr, 0, a - 1);

        // Reverse the second part
        reverse(arr, a, arr.length - 1);

        // Reverse the whole array
        reverse(arr, 0, arr.length - 1);
    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        // Create an instance of ArrayRotator
        Reversal rotator = new Reversal();

        // Define the array and the rotation step
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 4;

        // Rotate the array
        rotator.rotate(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

