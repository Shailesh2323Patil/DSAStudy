package Strivers.array.medium.SortArray012;

/**
 * Dutch National flag algorithm.
 * */
public class SortArray012OptimalApproach {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[] {0, 2, 1, 2, 0, 1};
        sortArray(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
