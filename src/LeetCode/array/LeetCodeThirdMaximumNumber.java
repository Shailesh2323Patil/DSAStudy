package LeetCode.array;

import java.util.Arrays;

public class LeetCodeThirdMaximumNumber {

	public static void main(String[] args) {
		
		int[] nums = {3,3,4,3};
		
		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {
		
		Arrays.sort(nums);
		
		int length = nums.length;
		
		int j = length - 1;
		
		if(j < 2) {
			return nums[j];
		}
		
		
		int[] maxArr = new int[3];
		
		int maxNumber = 0;
		
		while(j >= 0 && maxNumber < 3) {
			
			if(maxNumber == 0) {
				 maxArr[maxNumber] = nums[j];
				 maxNumber++;
			}
			else if(nums[j] != maxArr[maxNumber-1]) {
				maxArr[maxNumber] = nums[j];	
				maxNumber++;
			}
			j--;
		}
		
		if(maxNumber == 3) {
			return maxArr[2];
		}
		else {
			return maxArr[0];
		}
    }
}
