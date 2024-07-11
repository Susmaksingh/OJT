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

public class TwoSum_III_DataStructure {
    public static class TwoSum {
        private HashMap<Integer, Integer> elements = new HashMap<>();

        // Method to add a number to the data structure
        public void add(int number) {
            // If the number is already in the map, increment its count
            if (elements.containsKey(number)) {
                elements.put(number, elements.get(number) + 1);
            } else {
                // Otherwise, add the number with a count of 1
                elements.put(number, 1);
            }
        }

        // Method to find if there exists any pair of numbers which sum is equal to the value
        public boolean find(int value) {
            for (Integer i : elements.keySet()) {
                int target = value - i;
                // Check if the target value exists in the map
                if (elements.containsKey(target)) {
                    // If the target is the same as the current number, ensure there are at least two of them
                    if (i.equals(target) && elements.get(target) < 2) {
                        continue;
                    }
                    return true;
                }
            }
            return false; // Return false if no such pair is found
        }
    }

    // Main method to test the TwoSum class
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        
        // Adding numbers to the data structure
        ts.add(1);
        ts.add(3);
        ts.add(5);
        
        // Checking if pairs exist that sum to a specific value
        System.out.println(ts.find(4));  // true (1 + 3)
        System.out.println(ts.find(7));  // false (no pairs sum to 7)
        System.out.println(ts.find(9));  // false (no pairs sum to 9)
        System.out.println(ts.find(8));  // true (5 + 3)
    }
}

