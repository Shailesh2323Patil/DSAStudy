package ShardhaDidi.sorting;

import java.util.Arrays;

/**
 * Pick Smallest Element Set At First With Only One Swap
 * */
public class B_SelectionSortInteger {
    public static void main(String[] args) {
        int[] numbers = {6,8,7,2,4,5};

        for(int i=0; i<numbers.length; i++) {
            int smallest = i;

            for(int j = i+1; j<numbers.length; j++) {
                if(numbers[smallest] > numbers[j]) {
                    smallest = j;
                }
            }

            // Swap
            int temp = numbers[i];
            numbers[i] = numbers[smallest];
            numbers[smallest] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}