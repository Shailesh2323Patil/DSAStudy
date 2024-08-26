package Strivers.array.easy;

import java.util.Arrays;

public class FindMissingNumberBetterApproach {
    public static void main(String args[]) {
        //int a[] = {1, 2, 4, 5};
        //int a[] = {0,1};
        int a[] = {9,6,4,2,3,5,7,0,1};

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int hash[] = new int[n + 2]; //hash array

        // storing the frequencies:
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        //checking the freqencies for numbers 1 to n:
        for (int i = nums[0]; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
}
