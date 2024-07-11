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

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[] {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*/";
        
        Stack<Integer> stack = new Stack<>();
        
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(Integer.valueOf(t));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (t) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }
        returnValue = stack.pop();
        
        return returnValue;
    }
}

