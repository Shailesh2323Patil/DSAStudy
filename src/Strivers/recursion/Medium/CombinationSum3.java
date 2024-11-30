package Strivers.recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String args[]) {
        int start = 1;
        int target = 7;
        int length = 3;
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        searchCombinations(start, target, answer, ds, length);
        System.out.println(answer);
    }

    // Helper method to perform depth-first search for combinations
    private static void searchCombinations(int start, int remainingSum, List<List<Integer>> answer, List<Integer> ds, int length) {
        // If remaining sum is zero and the current combination's size is k
        if (remainingSum == 0) {
            if (ds.size() == length) {
                // Found a valid combination, add a copy to the result list
                answer.add(new ArrayList<>(ds));
            }
            return; // Backtrack
        }
        // If the current number exceeds 9, the remaining sum, or if we have enough numbers in the current combination
        if (start > 9 || start > remainingSum || ds.size() >= length) {
            return; // Cannot find a valid combination from here, backtrack
        }
        // Include 'start' in the current combination
        ds.add(start);
        // Continue to the next number with the updated remaining sum
        searchCombinations(start + 1, remainingSum - start, answer, ds, length);
        // Exclude 'start' from the current combination (backtrack)
        ds.remove(ds.size() - 1);
        // Continue to the next number without including 'start'
        searchCombinations(start + 1, remainingSum, answer, ds, length);
    }
}
