package Strivers.binarySearch.MinimumDaysToMBouquets;

public class MinimumDaysToMBouquetsBruteForce {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,12,7,7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }

    private static int roseGarden(int[] arr, int m, int k) {
        int n = arr.length;

        if(n < m*k) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        for(int i=min; i<=max; i++) {
            if(possible(arr, i, m, k)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean possible(int[] arr,int day, int m, int k) {
        int cnt = 0;
        int nOB = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= day) {
                cnt++;
            }
            else {
                nOB += (cnt/k);
                cnt = 0;
            }
        }

        nOB += (cnt/k);

        return (nOB >= m);
    }
}
