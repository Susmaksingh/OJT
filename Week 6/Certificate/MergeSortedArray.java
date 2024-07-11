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

public class MergeSortedArray {
    
    public static void main(String[] args) {
        // Example arrays
        int[] A = {1, 3, 5, 0, 0, 0}; // A has enough space to accommodate B
        int[] B = {2, 4, 6};
        
        int m = 3; // number of elements in A (excluding trailing zeroes)
        int n = 3; // number of elements in B
        
        // Create an instance of the Solution class and call the merge method
        Solution solution = new Solution();
        solution.merge(A, m, B, n);
        
        // Print the merged array
        System.out.println(Arrays.toString(A));
    }

    public static class Solution {
        public void merge(int A[], int m, int B[], int n) {
            // Start from the end of both arrays
            while (m > 0 && n > 0) {
                if (A[m - 1] > B[n - 1]) {
                    // If the current element in A is greater than the current element in B,
                    // place A[m-1] at the end of the merged array
                    A[m + n - 1] = A[m - 1];
                    m--; // move the pointer in A
                } else {
                    // Otherwise, place B[n-1] at the end of the merged array
                    A[m + n - 1] = B[n - 1];
                    n--; // move the pointer in B
                }
            }
            
            // If there are remaining elements in B, copy them over to A
            while (n > 0) {
                A[m + n - 1] = B[n - 1];
                n--;
            }
        }
    }
}

