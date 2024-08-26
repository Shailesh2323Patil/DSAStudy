package Strivers.binarySearch;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }

    private static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low+high) / 2;

            if(arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}
