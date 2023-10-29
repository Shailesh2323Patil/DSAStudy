package Logical;

public class FibonacciSeries {
	public static void main(String[] args) {
		int number1 = 0, number2 = 1, sum = 0;
		
		System.out.println(number1+"\n"+number2);
		
		for(int i = 2; i < 10; i++) {
			sum = number1 + number2;
			System.out.println(sum);
			
			number1 = number2;
			number2 = sum;
		}
	}
}
