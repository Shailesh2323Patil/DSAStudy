package ShardhaDidi.recursion;

public class PrintPermutation {
	
	public static void printPermutation(String str, String perm)
	{
	   if(str.length() == 0) {
		   System.out.println(perm);
		   return;
	   }
	   
	   
	   for(int i = 0; i < str.length(); i++) {
		   char currChar = str.charAt(i);
		   
		   String beforeStr = str.substring(0,i);
		   String afterStr = str.substring(i+1);
		   
		   String newStr = beforeStr + afterStr;
		   
		   printPermutation(newStr, perm+currChar);
	   }
	}

	public static void main(String args[]) {
       String str = "abc";
       printPermutation(str, "");
	}
}
