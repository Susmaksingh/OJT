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

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            Character c = getKey(map, c2);
            if (c != null && c != c1) {
                return false;
            } else if (map.containsKey(c1)) {
                if (c2 != map.get(c1)) {
                    return false;
                }
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }

    // a method for getting key of a target value
    public Character getKey(HashMap<Character, Character> map, Character target) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue().equals(target)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Is '" + s1 + "' isomorphic to '" + t1 + "'? " + isomorphicStrings.isIsomorphic(s1, t1));
        
        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Is '" + s2 + "' isomorphic to '" + t2 + "'? " + isomorphicStrings.isIsomorphic(s2, t2));
        
        String s3 = "paper";
        String t3 = "title";
        System.out.println("Is '" + s3 + "' isomorphic to '" + t3 + "'? " + isomorphicStrings.isIsomorphic(s3, t3));
    }
}

