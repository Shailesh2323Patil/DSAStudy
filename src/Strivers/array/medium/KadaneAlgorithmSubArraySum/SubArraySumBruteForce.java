package Strivers.array.medium.KadaneAlgorithmSubArraySum;

public class SubArraySumBruteForce {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubArraySum(arr, n);
        System.out.println("The maximum Sub Array sum is: " + maxSum);
    }

    static int maxSubArraySum(int[] arr, int size) {
        int maximum = Integer.MIN_VALUE;

        // Traverse from the Index by Index
        for(int i = 0; i < size; i++) {

            // Start Traverse From ith Index
            for(int j = i; j < size; j++) {
                // Initialise the sum variable
                int sum = 0;

                // Start traverse from ith Index to jth Index
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maximum = Math.max(sum, maximum);
            }
        }

        return maximum;
    }
}
