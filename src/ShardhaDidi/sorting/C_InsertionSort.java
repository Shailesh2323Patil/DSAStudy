package ShardhaDidi.sorting;

import java.util.Arrays;

/**
 * 1) Lets Break List into Sorted and Unsorted Array
 * 2) Assume, First Element Fall in Sorted Array and Rest are Unsorted Array
 * 3) Start your For Loop from 1 index
 * 4) Take i value as your current (variable)
 * 5) and Take j variable, Assume j variable comes in Sorted Array
 * 6) We Need to Always Set j = i-1
 * 7) Means to check ith value means current value with each element of sorted Array
 * 8) If we found current variable is Less than Sorted Element, then
 * 9) Push the Element to Next Position and Decrease the j Position by 1
 * 10) And If We Found current value in Greater than Sorted Element, then
 * 11) Place the Element Next to Sorted Element.
 * */
public class C_InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {3,4,1,2,5};

        for(int i=1; i<numbers.length; i++) {
            int current = numbers[i];

            int j = i-1;

            while(j >= 0 && current < numbers[j]) {
                numbers[j+1] = numbers[j];
                j--;
            }

            numbers[j+1] = current;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
