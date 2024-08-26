package Strivers.binarySearch;

public class CountOccurrenceInArray {
    public static void main(String[] args) {
        int[] arr =  {2, 2 , 3 , 3 , 3 , 3 , 4};
        int size = 7, value = 3;
        int ans = count(arr, value, size);
        System.out.println("The number of occurrences is: " + ans);
    }

    private static int firstOccurrence(int arr[], int value, int size) {
        int low = 0;
        int high = size-1;
        int ans = 0;

        while (low <= high) {
            int mid = (low+high) / 2;

            if(arr[mid] == value) {
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < value) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private static int lastOccurrence(int arr[], int value, int size) {
        int low = 0;
        int high = size-1;
        int ans = 0;

        while (low <= high) {
            int mid = (low+high) / 2;

            if (arr[mid] == value) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] < value) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private static int[] countOccurrence(int arr[], int value, int size) {
        int[] data = new int[2];
        int firstOccurrence = firstOccurrence(arr, value, size);

        if(firstOccurrence == 0) {
            data[0] = 0;
            data[1] = 0;
        }
        else {
            int lastOccurrence = lastOccurrence(arr, value, size);
            data[0] = firstOccurrence;
            data[1] = lastOccurrence;
        }

        return data;
    }

    private static int count(int arr[], int value, int size) {
        int[] data = countOccurrence(arr, value, size);
        int count = data[1] - data[0] + 1;
        return count;
    }
}
