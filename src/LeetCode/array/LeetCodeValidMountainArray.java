package LeetCode.array;

public class LeetCodeValidMountainArray {
	public static void main(String[] args) {
		//int[] arr = {0,3,2,1};
		
		//int[] arr = {0,2,3,4,5,2,1,0};
		
		//int[] arr = {0,2,3,4,5,2,1,1};
		
		//int[] arr = {2,1};
		
		//int[] arr = {1,3,2};
		
		//int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		
		int len = arr.length;
		
		int bigPosition = greatestValueWithPosition(arr);
		
		System.out.println(isValidMountainArray(arr, bigPosition));
	}
	
	
	private static boolean isValidMountainArray(int[] arr, int bigPosition) {
	
		boolean validMountainReach = false;
		
		if(arr.length >= 3 && arr[(arr.length - 1)] != arr[bigPosition] && (arr[0] != arr[bigPosition])) 
		{	
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < arr[bigPosition] && (i < bigPosition)) { 
					if((arr[i] < arr[i+1])) {
						validMountainReach = true;	
					}
					else {
						return false;
					}
				}
				else if(arr[i] == arr[bigPosition] && i == bigPosition) {
					validMountainReach = true;
				}
				else if(arr[i] < arr[bigPosition] && (i >= bigPosition)) {
					if((i+1) == arr.length) {
						validMountainReach = true;
					}
					else if(arr[i] > arr[i+1]) {
						validMountainReach = true;
					}
					else {
						return false;
					}
				}
				else {
					validMountainReach = false;
				}
			}
		}
		
		return validMountainReach;
	}
	
	private static int greatestValueWithPosition(int[] arr) {
		int bigValue = arr[0];
		int bigPosition = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > bigValue) {
				bigValue = arr[i];
				bigPosition = i;
			}
		}
		
		return bigPosition;
	}
}
