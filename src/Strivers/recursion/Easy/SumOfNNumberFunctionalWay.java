package Strivers.recursion.Easy;

public class SumOfNNumberFunctionalWay {

    public static void main(String[] args) {
        // Here, let’s take the value of n to be 3.
        int n = 3;
        System.out.println(func(n));
    }

    static int func(int n){
        if(n == 0) {
            return 0;
        }

        int data = func(n-1);

        return n + data;
    }
}
