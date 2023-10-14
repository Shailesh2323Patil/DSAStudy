package Strivers.array.medium.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceOptimal2 {
    public static int longestSuccessiveElements(int[] a)
    {
        int size = a.length;
        if (size == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < size; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
