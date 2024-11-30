package Strivers.recursion.Easy;

public class FibonacciSeries {
    static int fibonacci(int N){
        // Base Condition.
        if(N <= 1){
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int sLast = fibonacci(N-2);

        return last + sLast;
    }
    public static void main(String[] args) {
        // Here, let’s take the value of N to be 4.
        int N = 4;
        System.out.println(fibonacci(N));
    }
}
