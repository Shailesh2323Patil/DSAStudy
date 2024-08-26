package Strivers.array.medium.MaximumSubarraySumInAnArray;

public class MaximumSubArraySumInAnArrayOptimal {

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum = maxSubArray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += nums[i];

            if(sum > max) {
                max = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
