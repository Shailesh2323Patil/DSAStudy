package Strivers.binarySearch.KokoEatingBananas;

public class KokoEatingBananasBruteForce {
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }

    private static int minimumRateToEatBananas(int[] v, int h) {
        int maxi = maximum(v);

        for (int i = 1; i < maxi; i++) {
            int reqHour = calculateTotalHours(v, i);

            if(reqHour <= h) {
                return i;
            }
        }

        return maxi;
    }

    private static int calculateTotalHours(int[] v, int hour) {
        int totalHour = 0;
        for (int i = 0; i < v.length; i++) {
            totalHour += Math.ceil((double) v[i] / (double) hour);
        }
        return totalHour;
    }

    private static int maximum(int[] v) {
        int max = Integer.MIN_VALUE;
        int length = v.length;

        for (int i = 0; i < length; i++) {
            max = Integer.max(v[i], max);
        }

        return max;
    }
}
