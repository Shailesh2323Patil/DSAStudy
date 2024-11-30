package Strivers.recursion.Easy;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = factorial(number);
        System.out.println("Factorial Of "+number+" is "+factorial);
    }

    static int factorial(int n) {
       if(n == 0) {
           return 1;
       }

       int data = factorial(n-1);

       return n * data;
    }
}
