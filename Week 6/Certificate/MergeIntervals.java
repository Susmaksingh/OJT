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

public class MergeIntervals {

    class Interval {
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
    }

    class Solution {
        public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
            if (intervals == null || intervals.size() <= 1) {
                return intervals;
            }

            // Sort intervals based on the starting time
            Collections.sort(intervals, new IntervalComparator());

            ArrayList<Interval> result = new ArrayList<>();

            Interval prev = intervals.get(0);
            for (int i = 1; i < intervals.size(); i++) {
                Interval curr = intervals.get(i);

                if (prev.end >= curr.start) {
                    // Merge case
                    prev.end = Math.max(prev.end, curr.end);
                } else {
                    result.add(prev);
                    prev = curr;
                }
            }

            // Add the last interval
            result.add(prev);
            return result;
        }

        class IntervalComparator implements Comparator<Interval> {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        }
    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        Solution solution = mergeIntervals.new Solution();

        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(mergeIntervals.new Interval(1, 3));
        intervals.add(mergeIntervals.new Interval(2, 6));
        intervals.add(mergeIntervals.new Interval(8, 10));
        intervals.add(mergeIntervals.new Interval(9, 27));
        intervals.add(mergeIntervals.new Interval(15, 18));

        ArrayList<Interval> result = solution.merge(intervals);

        for (Interval interval : result) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}

