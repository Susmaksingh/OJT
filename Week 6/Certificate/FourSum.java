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

public class FourSum {

    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Sort the array
        Arrays.sort(num);
        // Use a HashSet to avoid duplicates
        HashSet<ArrayList<Integer>> hashSet = new HashSet<>();
        // Result list to store the quadruplets
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Iterate over the array with two pointers
        for (int i = 0; i < num.length - 3; i++) {
            for (int j = i + 1; j < num.length - 2; j++) {
                int k = j + 1;
                int l = num.length - 1;

                // Use two more pointers to find the remaining two numbers
                while (k < l) {
                    int sum = num[i] + num[j] + num[k] + num[l];
                    if (sum > target) {
                        l--; // Decrease l to reduce the sum
                    } else if (sum < target) {
                        k++; // Increase k to increase the sum
                    } else {
                        // Found a quadruplet
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(num[i]); // Add the correct element (i instead of j)
                        temp.add(num[j]);
                        temp.add(num[k]);
                        temp.add(num[l]);

                        if (!hashSet.contains(temp)) {
                            hashSet.add(temp);
                            result.add(temp);
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FourSum fs = new FourSum();
        int[] num = {1, 0, -1, 0, -2, 2};
        int target = 0;
        ArrayList<ArrayList<Integer>> result = fs.fourSum(num, target);

        // Print the result
        for (ArrayList<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}

