package Logical;

public class ArmstrongNumber {
	
	//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. 
	// It is also known as pluperfect, or Plus Perfect, or Narcissistic number. 
	// It is an OEIS sequence A005188. Let’s understand it through an example.
	
	/*
	 * 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
	 * 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
	 * 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643 
	 * */
	
	//function to check if the number is Armstrong or not  
	static boolean isArmstrong(int n)   
	{   
		int temp = 0;
		int digit = 0;
		int last = 0;
		int sum = 0;
		
		temp = n;
		
		while(temp > 0) {
			temp = temp / 10;
			
			digit++;
		}
		
		temp = n;
		
		while(temp > 0) {
			last = temp % 10;
			
			sum += Math.pow(last, digit);
			
			temp = temp / 10;
		}
		
		
		if(sum == n) {
			return true;
		}
		else {
			return false;
		}
	}   
	
	//driver code  
	public static void main(String args[])     
	{     
		int num = 153 ;   
		System.out.print(ArmstrongNumber.isArmstrong(num));  
	}   
}
