package Strivers.array.medium.MaximumSubarraySumInAnArray;

public class MaximumSubArraySumInAnArrayBetter {

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum = maxSubArray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;

        for(int i=0; i<=n-1; i++) {

            int sum = 0;

            for(int j=i; j<=n-1; j++) {
                sum += nums[j];

                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
