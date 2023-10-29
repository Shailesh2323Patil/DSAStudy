package LeetCode.array;

import java.util.Arrays;

public class LeetCodeReplaceElementWithGreatestElement {
	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
	
		System.out.println(Arrays.toString(replaceElement(arr)));
	}
	
	
	private static int[] replaceElement(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) 
		{
			if(i == (arr.length - 1)) 
			{
				arr[i] = -1;
			}
			else 
			{
				
				int nextElement = i + 1;
				int greatestElement = arr[nextElement];
				
				for(int j = nextElement; j < (arr.length - 1); j++) 
				{	
					if(greatestElement < arr[j+1]) 
					{
						greatestElement = arr[j+1];
					}
				}
				
				arr[i] = greatestElement;
			}
		}
		
		return arr;
	}
}
