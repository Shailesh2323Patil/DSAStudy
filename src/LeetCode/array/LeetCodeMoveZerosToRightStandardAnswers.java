package LeetCode.array;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/move-zeroes-end-array/
 * */

public class LeetCodeMoveZerosToRightStandardAnswers {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		
		pushZerosToEnd(nums, nums.length);
	}
	
	static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
 
        for(int i=0; i<n; i++) {
        	if(arr[i] != 0) {
        		arr[count++] = arr[i];
        	}
        }
        
        while(count < n) {
        	arr[count++] = 0;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
