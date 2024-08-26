package Strivers.array.medium.LongestSumArrayWithGivenSum;

public class LongestSumArrayWithGivenSumBetter {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubArray(a, k);
        System.out.println("The length of the longest sub array is: " + len);
    }

    public static int getLongestSubArray(int []a, long total) {
        int n = a.length;

        int len = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                long sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }

                if (sum == total) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}
