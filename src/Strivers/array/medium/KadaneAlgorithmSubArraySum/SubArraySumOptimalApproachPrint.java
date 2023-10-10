package Strivers.array.medium.KadaneAlgorithmSubArraySum;

public class SubArraySumOptimalApproachPrint {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubArraySum(arr, n);
        System.out.println("The maximum sub array sum is : " + maxSum);
    }

    static int maxSubArraySum(int[] arr, int size) {
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for(int i=0; i<size; i++)
        {
            if(sum == 0) {
                start = i;
            }

            sum += arr[i];

            if(sum > maxNumber) {
                maxNumber = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.print("The SubArray is = [ ");
        for(int i=ansStart; i<=ansEnd; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        return maxNumber;
    }
}
