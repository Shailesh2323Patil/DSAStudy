package ShardhaDidi.sorting;

import java.util.Arrays;

/**
 * Place Smallest Number At First
 * */
public class SortingInteger {
    public static void main(String[] args) {
        int numbers[] = {2,5,1,5,8,6};

        for(int i=0; i < numbers.length; i++) {
            for(int j=i+1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
