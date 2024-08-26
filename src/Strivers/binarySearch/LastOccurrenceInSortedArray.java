package Strivers.binarySearch;

public class LastOccurrenceInSortedArray {
    public static void main(String args[]) {
        int n = 7;
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};

        // returning the last occurrence index if the element is present otherwise -1
        System.out.println(lastOccurrence(n, key, v));
    }

    private static int lastOccurrence(int size, int value, int[] arr) {
        int start = 0;
        int end = size-1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == value) {
                res = mid;
                start = mid + 1;
            }
            else if(value < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return res;
    }
}
