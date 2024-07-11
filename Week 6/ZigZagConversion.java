/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
public class ZigZagConversion {
    
    public String convert(String s, int numRows) {
        // Edge case: If numRows is 1, the result is the input string itself
        if (numRows == 1)
            return s;
        
        StringBuilder sb = new StringBuilder();
        // Step between characters in the zigzag pattern
        int step = 2 * numRows - 2;
        
        // Iterate through each row in the zigzag pattern
        for (int i = 0; i < numRows; i++) {
            // First and last rows (vertical columns in zigzag)
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j += step) {
                    sb.append(s.charAt(j));
                }
            } else {
                // Middle rows (diagonal lines in zigzag)
                int j = i;
                boolean flag = true; // Flag to alternate steps
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;
                
                while (j < s.length()) {
                    sb.append(s.charAt(j));
                    if (flag)
                        j += step1;
                    else
                        j += step2;
                    flag = !flag; // Toggle flag to alternate steps
                }
            }
        }
        return sb.toString();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        ZigZagConversion zigzag = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String converted = zigzag.convert(s, numRows);
        System.out.println("Original string: " + s);
        System.out.println("Converted string with " + numRows + " rows: " + converted);
    }
}

