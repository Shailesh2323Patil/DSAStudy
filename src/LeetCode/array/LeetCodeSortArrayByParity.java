package LeetCode.array;

import java.util.Arrays;

public class LeetCodeSortArrayByParity {
	public static void main(String[] args) {
		int[] nums = {3,1,2,4};
		
		atMostNGivenDigitSet(nums);
	}
	
	public static void atMostNGivenDigitSet(int[] nums) {
        
		int length = nums.length;
		
		int index = length - 1;
		
		int j = 0;
		
		while(j < index) {
			if(nums[j]%2 == 0) {
				j++;
			}
			else {
				int temp = nums[j];
			
				nums[j] = nums[index];
				nums[index] = temp;
				
				index--;
			}
		}
		
		System.out.println(Arrays.toString(nums));
    }
}
