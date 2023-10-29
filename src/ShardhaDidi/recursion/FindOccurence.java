package ShardhaDidi.recursion;

public class FindOccurence {
	
	public static int firstOccur = -1;
	public static int lastOccur = -1;
	
	public static void main(String[] args) {
		String str = "abcdaefg";
		char elm = 'a';
		
		findOccurence(str, elm, 0);
		
		System.out.println("First Occurence = "+firstOccur);
		System.out.println("Last Occurence = "+lastOccur);
	}
	
	
	public static void findOccurence(String str, char element, int index) {
		
		if(index == str.length()) {
			return;
		} 
		
		if(element == str.charAt(index)) {
			if(firstOccur == -1) {
				firstOccur = index;
			}
			else {
				lastOccur = index;
			}
		}
		
		findOccurence(str, element, index+1);
	}
}
