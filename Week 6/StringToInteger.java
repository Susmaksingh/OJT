/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
;
public class StringToInteger {
    public int atoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }

        // Trim leading and trailing white spaces
        str = str.trim();
        char flag = '+';
        
        // Check if the number is negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        // Use double to store the result to handle overflow
        double result = 0;

        // Convert the string to integer
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        // Apply the sign
        if (flag == '-') {
            result = -result;
        }

        // Handle integer overflow
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        StringToInteger converter = new StringToInteger();

        // Test cases
        String test1 = "hjhkjk";
        String test2 = "   -2323";
        String test3 = "6568 with words";
        String test4 = "435345 words and ";
        String test5 = "fyiuuiuiuiuiuiuig";
        String test6 = "fyiuuiuiuiuiuiuig 23698";

        System.out.println("Test 1: " + converter.atoi(test1)); // Expected: 0
        System.out.println("Test 2: " + converter.atoi(test2)); // Expected: -2323
        System.out.println("Test 3: " + converter.atoi(test3)); // Expected: 6568
        System.out.println("Test 4: " + converter.atoi(test4)); // Expected: 435345
        System.out.println("Test 5: " + converter.atoi(test5)); // Expected: 0
        System.out.println("Test 6: " + converter.atoi(test6)); // Expected: 0
    }
}
