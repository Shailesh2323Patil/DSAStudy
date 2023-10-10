package LeetCode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    public static int[] rotate(int[] nums, int k) {
        int round = 1;

        while(round <= k) {
            int position = nums[nums.length - 1];

            for(int i = nums.length-1; i > 0; i--) {
                nums[i] = nums[i-1];
            }

            nums[0] = position;
            round++;
        }

        return nums;
    }
}
