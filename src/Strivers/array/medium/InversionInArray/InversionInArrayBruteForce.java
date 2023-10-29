package Strivers.array.medium.InversionInArray;

public class InversionInArrayBruteForce {
    public static void main(String[] args) {
        long[] a = {5, 4, 3, 2, 1};
        int n = 5;
        long cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions is: " + cnt);
    }

    public static long numberOfInversions(long arr[], int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
