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

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        // base case: if pattern is empty, string must be empty to match
        if (p.length() == 0) {
            return s.length() == 0;
        }

        // Check if the first character of both strings match or if the pattern has '.'
        boolean firstMatch = (s.length() > 0 && 
                             (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        // case 1: when the second char of p is '*'
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // * can represent 0 or more of the preceding element
            // Case 1: ignore the current character and '*' in the pattern
            // Case 2: if firstMatch is true, move to the next character in the string
            return (isMatch(s, p.substring(2)) ||
                    (firstMatch && isMatch(s.substring(1), p)));
        } else {
            // case 2: when the second char of p is not '*'
            // move to the next character in both string and pattern if firstMatch is true
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        RegularExpressionMatching rem = new RegularExpressionMatching();

        // Test cases
        System.out.println(rem.isMatch("aa", "a")); // false
        System.out.println(rem.isMatch("aa", "a*")); // true
        System.out.println(rem.isMatch("ab", ".*")); // true
        System.out.println(rem.isMatch("aab", "c*a*b")); // true
        System.out.println(rem.isMatch("mississippi", "mis*is*p*.")); // false
    }
}

