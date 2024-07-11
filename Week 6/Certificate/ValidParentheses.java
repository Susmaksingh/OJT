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

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    // Method to check if the input string contains valid parentheses
    public static boolean isValid(String s) {
        // HashMap to store the pairs of parentheses
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i); // Get the current character
            
            // If the current character is an opening parenthesis
            if (map.keySet().contains(curr)) {
                stack.push(curr); // Push it onto the stack
            } else if (map.values().contains(curr)) { // If it is a closing parenthesis
                // Check if the stack is not empty and the top of the stack matches the closing parenthesis
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop(); // Pop the opening parenthesis from the stack
                } else {
                    return false; // If it doesn't match, return false
                }
            }
        }
        
        // If the stack is empty, all parentheses are balanced
        return stack.empty();
    }

    // Main method to test the isValid method
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(isValid(test1)); // Output: true
        System.out.println(isValid(test2)); // Output: true
        System.out.println(isValid(test3)); // Output: false
        System.out.println(isValid(test4)); // Output: false
        System.out.println(isValid(test5)); // Output: true
    }
}

