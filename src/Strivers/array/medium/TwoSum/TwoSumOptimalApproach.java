package Strivers.array.medium.TwoSum;

import java.util.Arrays;

public class TwoSumOptimalApproach {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

    public static String twoSum(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                return "YES";
            }
            else if(sum > target) {
                right--;
            }
            else {
                left++;
            }
        }

        return "NO";
    }
}
