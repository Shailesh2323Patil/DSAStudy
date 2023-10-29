package LeetCode.array;

import java.util.Arrays;

public class LeetCodeMergeSortedArray {
	
	public static void main(String[] args) {
		LeetCodeMergeSortedArray l1 = new LeetCodeMergeSortedArray();
		
		int[] num1 = {-1,0,0,3,3,3,0,0,0};
		int m = 6;
		int[] num2 = {1,2,2};
		int n = 3;
		
		l1.merge(num1, m, num2, n);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int lengthNum1 = m + n;
		int j = 0;
		
		if(m == 0) {
			for(int i=0; i<n; i++) {
				nums1[i] = nums2[i];
			}
		}
		else {
			for(int i=0; i<lengthNum1; i++) {
				if(nums1[i] == 0 && j < n) {
					nums1[i] = nums2[j];
					j++;
				}
			}
		}
		
		
		int[] num1Sorted = LeetCodeMergeSortedArray.arraySorting(nums1);
		
		System.out.print(Arrays.toString(num1Sorted));
    }
	
	public static int[] arraySorting(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				int temp = 0;
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		return arr;
	}
}
