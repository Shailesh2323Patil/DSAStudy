package LeetCode.array;

import java.util.Arrays;

public class RotateArrayBetter {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);

        return nums;
    }
    public static void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
