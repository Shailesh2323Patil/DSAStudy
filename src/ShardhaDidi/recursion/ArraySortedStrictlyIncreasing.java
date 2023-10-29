package ShardhaDidi.recursion;

public class ArraySortedStrictlyIncreasing {
	
	
	/* Check if an array is sorted (strictly increasing). - O(n) */
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,8,4,5,6};
		
		if(checkIncreasing(arr2, 0)) {
			System.out.println("Strictly Increasing");
		}
		else {
			System.out.println("Strictly Not Increasing");
		}
	}
	
	
	public static Boolean checkIncreasing(int[] arr, int index) {
		
		if((arr.length - 1) == index) {
			return true;
		}
		
		
		if(!checkIncreasing(arr, index+1)) {
			return false;
		}
	
		return (arr[index] < arr[index+1]);
	}
}
