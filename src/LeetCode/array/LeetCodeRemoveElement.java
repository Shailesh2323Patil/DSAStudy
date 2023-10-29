package LeetCode.array;

public class LeetCodeRemoveElement {
	public static void main(String[] args) {
		
		int elements[] = {0,1,2,2,3,0,4,2};
		int val = 2;
	
		System.out.println(Integer.toString(removeElement(elements,val)));
	}
	
	public static int removeElement(int[] elements, int val) {
		
		int n = elements.length;
		
		int j = 0;
		
		while(j < n) {
			if(elements[j] == val) {
				elements[j] = elements[n-1];
				n--;
			}
			else {
				j++;
			}	
		}
		
		return j;
	}
	

}
