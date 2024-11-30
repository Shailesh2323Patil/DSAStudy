package Strivers.recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    // Recursive function to find all letter combinations
    private static void letterCombinations(int[] a, String[] mp, int i, String curr, List<String> res) {
        // If we have used a mapping for every digit
        if (i == a.length) {
            res.add(curr);
            return;
        }

        // Get all characters mapped to current digit
        String chars = mp[a[i]];

        // Add every character to the res and make a recursive call for the next digit
        for (char c : chars.toCharArray()) {
            letterCombinations(a, mp, i + 1, curr + c, res);
        }
    }

    // Function to find list of all words possible by pressing given numbers
    public static List<String> possibleWords(int[] a) {
        String[] mp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        letterCombinations(a, mp, 0, "", res);
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int[] a = {2, 3};
        List<String> res = possibleWords(a);
        for (String word : res) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
