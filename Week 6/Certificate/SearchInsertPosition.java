/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate.array.in.java;

/**
 *
 * @author abcde
 */
//import java.util.*;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        int target = 5;
        Solution solution = new Solution();
        int position = solution.searchInsert(A, target);
        System.out.println("The target should be inserted at index: " + position);
    }
    
    static class Solution {
        public int searchInsert(int[] A, int target) {
            if (A == null || A.length == 0)
                return 0;
            return searchInsert(A, target, 0, A.length - 1);
        }
        
        private int searchInsert(int[] A, int target, int start, int end) {
            int mid = (start + end) / 2;
            if (target == A[mid])
                return mid;
            else if (target < A[mid])
                return start < mid ? searchInsert(A, target, start, mid - 1) : start;
            else
                return end > mid ? searchInsert(A, target, mid + 1, end) : (end + 1);
        }
    }
}

