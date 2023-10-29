package LeetCode.array;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeFindDisappearNumbers 
{
	public static void main(String[] args) 
	{
		int[] nums = {4,3,2,7,8,2,3,1};
		
		//int[] nums = {1,1};
		
		//int[] nums = {2,2};

		//int[] nums = {1,1,2,2};
		
		//int[] nums =  { 3, 3, 3, 5, 1 };
		
		System.out.println(FindMissing(nums));
	}
	
	static public List<Integer>FindMissing(int[] arr)
    {
        int i = 0;
       
        // Here we are using cyclic sort to sort the array
        while (i < arr.length) {
            int correct = arr[i] - 1;
           
            // Finding correct index
            if (arr[i] != arr[correct])
            {
               
                // calling swap function
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
       
        // just find missing number
        // Making List to store the potential answer
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
   
    // This is the swap function
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
