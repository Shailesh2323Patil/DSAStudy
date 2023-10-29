package ShardhaDidi.recursion;

import java.util.HashSet;

public class PrintUniqueSubSequence {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aaa";
		
		HashSet<String> set = new HashSet<String>();
		
		printSubsequence(str2, 0, "", set);
	}
	
	public static void printSubsequence(String str, int index, String res, HashSet<String> set) 
	{
		if(str.length() == index) {
			if(set.contains(res)) {
				return;
			}
			
			set.add(res);
			
			System.out.println(res);
			return;
		}
		
		printSubsequence(str, index + 1, res+str.charAt(index), set);
		
		printSubsequence(str, index + 1, res, set);
	}
}
