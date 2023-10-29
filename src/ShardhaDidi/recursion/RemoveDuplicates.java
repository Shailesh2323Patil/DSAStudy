package ShardhaDidi.recursion;

public class RemoveDuplicates {	
	public static void main(String args[]) {
		String str = "abcadbcefghabi";
		boolean present[] = new boolean[str.length()];
		System.out.println(removeDuplicates(str, 0, present));
	}	
	
	
	public static String removeDuplicates(String str, int index, boolean[] present) {
		if(index == str.length()) {
			return "";
		}
		
		char chr = str.charAt(index);
		
		if(present[chr - 'a']) {
			return removeDuplicates(str, index+1, present);
		}
		else {
			present[chr - 'a'] = true;
			return chr + removeDuplicates(str, index+1, present);
		}
	}
}
