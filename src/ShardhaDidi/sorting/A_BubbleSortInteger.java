package ShardhaDidi.sorting;

import java.util.Arrays;

/**
 * Place Heavy Object At the End
 * */
public class A_BubbleSortInteger {
    public static void main(String[] args) {
        int[] numbers = {2,8,4,5,6,7};

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length-1-i; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
