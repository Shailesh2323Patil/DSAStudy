package Strivers.array.medium.KadaneAlgorithmSubArraySum;

public class SubArraySumOptimalApproach {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubArraySum(arr, n);
        System.out.println("The maximum sub array sum is: " + maxSum);
    }

    static long maxSubArraySum(int[] arr, int size) {
        long maxNumber = Long.MIN_VALUE;
        long sum = 0;

        for(int i=0; i<size; i++) {
            sum += arr[i];

            if(sum > maxNumber) {
                maxNumber = sum;
            }

            // If sum < 0: discarded the calculated
            if(sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty sub array
        // uncomment the following check:
//        if(maxNumber < 0) {
//            maxNumber = 0;
//        }

        return maxNumber;
    }
}
