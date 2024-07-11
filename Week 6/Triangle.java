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

public class Triangle {
    // Method to find the minimum path sum in a triangle
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        // Create an array to store the minimum path sum at each level
        int[] total = new int[n];
        
        // Initialize the total array with the last row of the triangle
        for (int i = 0; i < triangle.get(n - 1).size(); i++) {
            total[i] = triangle.get(n - 1).get(i);
        }
        
        // Iterate from the second last row to the top of the triangle
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // Update the total array with the minimum path sum at each position
                total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
            }
        }
        
        // The minimum path sum from top to bottom is stored in total[0]
        return total[0];
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        
        // Constructing the triangle
        input.add(new ArrayList<>(Arrays.asList(2)));
        input.add(new ArrayList<>(Arrays.asList(3, 4)));
        input.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        input.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        
        // Calling the minimumTotal method and printing the result
        int result = triangle.minimumTotal(input);
        System.out.println("Minimum path sum: " + result);
    }
}
