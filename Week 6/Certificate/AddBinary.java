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

public class AddBinary {

    // Method to add two binary strings
    public String addBinary(String a, String b) {
        // Check if either string is null or empty
        if (a == null || a.length() == 0)
            return b;
        if (b == null || b.length() == 0)
            return a;

        int pa = a.length() - 1; // Pointer for string a
        int pb = b.length() - 1; // Pointer for string b
        int flag = 0; // Carry flag for addition
        StringBuilder sb = new StringBuilder(); // StringBuilder to store result

        // Loop through both strings from right to left
        while (pa >= 0 || pb >= 0) {
            int va = 0; // Value from string a
            int vb = 0; // Value from string b

            // Convert char to int value (0 or 1)
            if (pa >= 0) {
                va = a.charAt(pa) == '0' ? 0 : 1;
                pa--;
            }
            if (pb >= 0) {
                vb = b.charAt(pb) == '0' ? 0 : 1;
                pb--;
            }

            // Calculate sum of va, vb, and carry flag
            int sum = va + vb + flag;
            if (sum >= 2) {
                sb.append(String.valueOf(sum - 2)); // Append sum - 2 to result
                flag = 1; // Set carry flag to 1
            } else {
                flag = 0; // Reset carry flag to 0
                sb.append(String.valueOf(sum)); // Append sum to result
            }
        }

        // After loop, if there is a remaining carry, append it
        if (flag == 1) {
            sb.append("1");
        }

        // Reverse the result StringBuilder and convert to String
        String reversed = sb.reverse().toString();
        return reversed;
    }

    // Main method to test the addBinary function
    public static void main(String[] args) {
        AddBinary addBinaryObj = new AddBinary();
        String a = "1010";
        String b = "1011";
        String sum = addBinaryObj.addBinary(a, b);
        System.out.println("Binary sum of " + a + " and " + b + " is: " + sum);
    }
}
