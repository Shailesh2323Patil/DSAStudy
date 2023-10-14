package Strivers.array.medium.LongestConsecutiveSequence;

import java.util.Arrays;

public class LongestConsecutiveSequenceOptimal1 {
    public static int longestSuccessiveElements(int[] arr)
    {
        int size = arr.length;
        if (size == 0) return 0;

        //sort the array:
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < size; i++)
        {
            if (arr[i] - 1 == lastSmaller) {
                //arr[i] is the next element of the
                //current sequence.
                count += 1;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
