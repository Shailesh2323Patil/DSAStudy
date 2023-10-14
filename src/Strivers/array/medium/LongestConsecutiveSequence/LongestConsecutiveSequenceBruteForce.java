package Strivers.array.medium.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceBruteForce {
    public static boolean linearSearch(int[] arr, int num) {
        int size = arr.length; //size of array
        for (int i = 0; i < size; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }
    public static int longestSuccessiveElements(int[] arr) {
        int size = arr.length; //size of array
        int longest = 1;

        //pick a element and search for its
        //consecutive numbers:
        for (int i = 0; i < size; i++) {
            int x = arr[i];
            int cnt = 1;
            //search for consecutive numbers
            //using linear search:
            while (linearSearch(arr, x + 1) == true) {
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
