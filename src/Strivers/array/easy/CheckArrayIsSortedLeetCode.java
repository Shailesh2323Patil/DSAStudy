package Strivers.array.easy;

public class CheckArrayIsSortedLeetCode {

    /*
        Given an array nums, return true if the array was originally sorted in non-decreasing order,
        then rotated some number of positions (including zero). Otherwise, return false.

        There may be duplicates in the original array.

        Note: An array A rotated by x positions results in an array B of the same length such that
        A[i] == B[(i+x) % A.length], where % is the modulo operation.

        Example 1:

        Input: nums = [3,4,5,1,2]
        Output: true
        Explanation: [1,2,3,4,5] is the original sorted array.
        You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

        Example 2:

        Input: nums = [2,1,3,4]
        Output: false
        Explanation: There is no sorted array once rotated that can make nums.

        Example 3:

        Input: nums = [1,2,3]
        Output: true
        Explanation: [1,2,3] is the original sorted array.
        You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
    */

    public static void main(String args[]) {
        //int arr[] = {3,4,5,1,2};
        //int arr[] = {2,1,3,4};
        int arr[] = {1,2,3,4};

        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] nums) {
        int c = 0;

        int length = nums.length;

        for(int i = 0;i < nums.length; i++)
        {
            int num1 = nums[i];
            int num2 = nums[(i+1) % length];

            if(num1 > num2){
                c++;
            }
            if(c > 1){
                return false;
            }
        }
        return true;

    }
}
