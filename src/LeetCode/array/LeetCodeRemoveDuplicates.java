package LeetCode.array;


public class LeetCodeRemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(Integer.toString(removeDuplicate(nums)));
	}
	
	public static int removeDuplicate(int[] nums) 
	{	
		int length = nums.length;
		
		int index = 1;
		
		int val = nums[0];
		
		int j = 0;
		
		while(j < length)
		{
			if(val == nums[j])
			{
				j++;
			}
			else
			{
				nums[index] = nums[j];
				
				index++;
				val = nums[j];
			}
		}
			
		return index;
	}
}
