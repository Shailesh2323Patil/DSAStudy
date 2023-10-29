package ShardhaDidi.recursion;

public class MoveAllXToEndString {

	public static void main(String[] args) {
		String str = "abcdefxghxixjxxxk";
		int count = 0;
		String newStr = moveAllX(str, 0, count);
		System.out.println(newStr);
	}
	
	
	public static String addAllX(int count) {
		String newStr = new String();
		for(int i=0; i<count; i++) {
			newStr += "x";
		}
		return newStr;
	}
	
	public static String moveAllX(String str, int index, int count) {
		if(index == str.length()) {
			return addAllX(count);
		}
		
		if(str.charAt(index) == 'x') {
			return moveAllX(str, index+1, count+1);
		}
		else {
			String newStr = moveAllX(str, index+1, count);
			
			return str.charAt(index) + newStr;
		}
	}

}


