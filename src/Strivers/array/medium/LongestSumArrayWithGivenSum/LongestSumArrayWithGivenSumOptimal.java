package Strivers.array.medium.LongestSumArrayWithGivenSum;

public class LongestSumArrayWithGivenSumOptimal {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubArray(a, k);
        System.out.println("The length of the longest sub array is: " + len);
    }

    public static int getLongestSubArray(int[] arr, long total) {

        int left = 0;
        int right = 0;
        int maxLength = 0;

        int n = arr.length;

        int sum = arr[0];

        while(right < n) {

            while (left < right && sum > total) {
                sum -= arr[left];
                left++;
            }

            if(sum == total) {
                maxLength = Math.max(maxLength, right-left+1);
            }

            right++;

            if(right < n) {
                sum += arr[right];
            }
        }

        return maxLength;
    }
}
