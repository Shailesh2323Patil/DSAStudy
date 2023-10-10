package Strivers.array.medium.KadaneAlgorithmSubArraySum;

public class SubArraySumBetterApproach {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubArraySum(arr, n);
        System.out.println("The maximum Sub Array sum is: " + maxSum);
    }

    static int maxSubArraySum(int[] arr, int size) {
        int maximum = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++) {
            int sum = 0;

            for(int j = i; j < size; j++) {
                // current subArray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];
                maximum = Math.max(sum, maximum);
            }
        }

        return maximum;
    }
}
