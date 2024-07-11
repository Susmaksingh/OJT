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

public class InsertInterval {
    // Definition for an interval.
    public static class Interval {
        int start;
        int end;
        Interval() { 
            start = 0; 
            end = 0; 
        }
        Interval(int s, int e) { 
            start = s; 
            end = e; 
        }
        public String toString() {
            return "[" + start + ", " + end + "]";
        }
    }

    public static class Solution {
        public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
            ArrayList<Interval> result = new ArrayList<>();
            
            for (Interval interval : intervals) {
                if (interval.end < newInterval.start) {
                    // If the current interval ends before the new interval starts, add it to the result as is.
                    result.add(interval);
                } else if (interval.start > newInterval.end) {
                    // If the current interval starts after the new interval ends, add the new interval and update it to the current one.
                    result.add(newInterval);
                    newInterval = interval;
                } else {
                    // If the intervals overlap, merge them.
                    newInterval = new Interval(
                        Math.min(interval.start, newInterval.start),
                        Math.max(interval.end, newInterval.end)
                    );
                }
            }
            
            // Add the last merged interval
            result.add(newInterval);
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        
        Interval newInterval = new Interval(2, 5);
        
        ArrayList<Interval> result = solution.insert(intervals, newInterval);
        
        for (Interval interval : result) {
            System.out.println(interval);
        }
    }
}
