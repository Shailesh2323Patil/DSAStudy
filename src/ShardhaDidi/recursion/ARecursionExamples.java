package ShardhaDidi.recursion;

public class ARecursionExamples {
	
	public static void main(String[] args) {
		
	}

	/* Reverse String
	 * 
	 * String str = "abcd";
	 * System.out.print(reverseString(str));
	 * 
	 * public static String reverseString(String str) {
	 * 
	 * if(str.length() == 1) { return str; }
	 * 
	 * char currChar = str.charAt(0);
	 * 
	 * String nextString = reverseString(str.substring(1));
	 * 
	 * return nextString + currChar; }
	 */
	
	
	/* Print x^n (with stack height = logn)
	 * 
	 * System.out.println(printPower(2, 5));
	 * 
	 * public static int printPower(int x, int n) { 
	 * 		if(n == 0) { return 1; }
	 * 
	 * 		if(x == 0) { return 0; }
	 * 
	 * 		if(n%2 == 0) { 
	 * 			return printPower(x, n/2) * printPower(x, n/2);
	 * 		} 
	 * 		else {
	 * 			return printPower(x, n/2) * printPower(x, n) * x;
	 * 		}
	 *  }
	 */
	
	
	/*
	 * Print x^n (with stack height = n)
	 * 
	 * int x=2; int n=5;
	 * System.out.println(printPower(2, 5));
	 * 
	 * public static int printPower(int x, int n) {
	 * 
	 * if(n==0) { return 1; }
	 * 
	 * if(x==0) { return 0; }
	 * 
	 * int x_ = printPower(x, n-1);
	 * 
	 * int a = x * x_;
	 * 
	 * return a;
	 * }
	 */
	
	
	/* Fibonacci Series
	 *  
	 * printFibonacciSeries(0,1,5);
	 *  
	 * public static void printFibonacciSeries(int a, int b, int n) {
	 * 
	 * if(n == 0) { return; }
	 * 
	 * System.out.print(a+" ");
	 * 
	 * printFibonacciSeries(b, a+b, n-1); }
	 */
	
	/* Factorial
	 * 
	 * printFactorial(3,1);
	 * 
	 * public static void printFactorial(int n, int fact) { if(n == 0) {
	 * System.out.println(fact); return; }
	 * 
	 * 
	 * fact *= n;
	 * 
	 * printFactorial(n-1, fact); }
	 */
}
