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

public class Wildcard_Matching {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int iIndex = -1;
        
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                // Match character or '?'
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                // Record position of '*'
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                // If previous pattern character was '*'
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                // No match
                return false;
            }
        }
        
        // Check for remaining characters in pattern
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }
        
        return j == p.length();
    }

    public static void main(String[] args) {
        Wildcard_Matching wm = new Wildcard_Matching();
        String s = "abcde";
        String p = "a*?de";
        
        boolean result = wm.isMatch(s, p);
        System.out.println("Does the string match the pattern? " + result);
    }
}

    

