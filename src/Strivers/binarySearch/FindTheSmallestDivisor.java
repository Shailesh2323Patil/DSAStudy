package Strivers.binarySearch;

public class FindTheSmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int low = 1;
        int high = max;
        int ans = 0;

        while(low<=high) {
            int mid = (low+high) / 2;

            if(sumByD(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static int sumByD(int arr[], int d) {
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += Math.ceil((double) arr[i] / (double) d);
        }

        return sum;
    }
}
