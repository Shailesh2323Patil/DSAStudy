package Strivers.array.easy;

public class RotateLeftArrayByXPlaces {
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        LeftRotateArray(arr, k);
        System.out.println("After Rotating the elements to left ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void LeftRotateArray(int[] nums, int k)
    {
        if(nums.length == 0) {
            return;
        }

        int n = nums.length;

        k = k % n;

        if(k > n) {
            return;
        }

        int temp[] = new int[k];

        for(int i=0; i<k; i++) {
            temp[i] = nums[i];
        }

        for(int i=0; i<n-k; i++) {
            nums[i] = nums[i+k];
        }

        for(int i=n-k; i<n; i++) {
            nums[i] = temp[i-n+k];
        }
    }
}
