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

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        // Stack to store indices and their corresponding character types (0 for '(', 1 for ')')
        Stack<int[]> stack = new Stack<>();
        int result = 0;
        
        // Iterate through the string character by character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                // If the character is '(', push its index and type (0) onto the stack
                stack.push(new int[] { i, 0 });
            } else {
                // If the character is ')'
                if (stack.empty() || stack.peek()[1] == 1) {
                    // If the stack is empty or the top of the stack is ')', push its index and type (1)
                    stack.push(new int[] { i, 1 });
                } else {
                    // If the top of the stack is '(', pop it (as we found a valid pair)
                    stack.pop();
                    // Calculate the current length of the valid substring
                    int currentLen = 0;
                    if (stack.empty()) {
                        // If the stack is empty, the valid substring extends from the beginning
                        currentLen = i + 1;
                    } else {
                        // Otherwise, it extends from the last unmatched parenthesis
                        currentLen = i - stack.peek()[0];
                    }
                    // Update the result with the maximum valid substring length found
                    result = Math.max(result, currentLen);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";

        // Calling the function and printing the results
        System.out.println("Longest valid parentheses in \"" + s1 + "\": " + longestValidParentheses(s1)); // Output: 2
        System.out.println("Longest valid parentheses in \"" + s2 + "\": " + longestValidParentheses(s2)); // Output: 4
        System.out.println("Longest valid parentheses in \"" + s3 + "\": " + longestValidParentheses(s3)); // Output: 0
    }
}

    
    

