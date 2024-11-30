package Strivers.recursion.Easy;

public class SumOfNNumberParameterisedWay {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(func(n, 0));
    }

    static int func(int i, int sum){
        if(i < 1) {
            return sum;
        }

        return func(i-1, sum+i);
    }
}
