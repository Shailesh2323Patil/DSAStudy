package ShardhaDidi.recursion;

public class PrintKeypadCombination {
	public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void printKeypadCombination(String number, int idx, String res) {
		if(number.length() == idx) {
			System.out.println(res);
			return;
		}
		
		int in = number.charAt(idx) - '0';
		
		int length = keypad[in].length();
		
		for(int i=0; i<length; i++) {
			
			char chr = keypad[number.charAt(idx) - '0'].charAt(i);
			
			printKeypadCombination(number, idx + 1, res+chr);
		}
	}
	
	public static void main(String args[]) {
		String number = "23";
		printKeypadCombination(number, 0, "");
	}
}
