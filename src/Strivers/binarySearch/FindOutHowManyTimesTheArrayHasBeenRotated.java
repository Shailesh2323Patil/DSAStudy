package Strivers.binarySearch;

public class FindOutHowManyTimesTheArrayHasBeenRotated {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr, arr.length);
        System.out.println("The array is rotated " + ans + " times.");
    }

    private static int findKRotation(int arr[], int n) {
        int low = 0;
        int high = n-1;
        int index = -1;
        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low+high) / 2;

            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if(arr[low] <= arr[mid]) {
                if(arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                low = mid+1;
            }
            else {
                if(arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }
}
